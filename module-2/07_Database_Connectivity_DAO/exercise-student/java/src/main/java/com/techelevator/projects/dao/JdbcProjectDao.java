package com.techelevator.projects.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);

	}

	@Override
	public Project getProject(Long projectId) {
		Project project = new Project();
		String sql = "SELECT project_id, name, from_date, to_date FROM project WHERE project_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		if (results.next()) {
			return MapProjectsToRow(results);
		}
		return null;
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<>();
		String sql = "SELECT pe.project_id, name, from_date, to_date, employee_id FROM project p INNER JOIN project_employee pe ON pe.project_id = p.project_id ;\n";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			projects.add(MapProjectsToRow(results));
		}
		return projects;
	}

	@Override
	public Project createProject(Project newProject) {
		Project project = new Project();
		String insert = "INSERT INTO project (name, from_date, to_date) VALUES (?, ?, ?) RETURNING project_id";
		Long newId = jdbcTemplate.queryForObject(insert, Long.class, newProject.getName(), newProject.getFromDate(), newProject.getToDate());
		String sql = "SELECT project_id, name, from_date, to_date FROM project WHERE project_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, newId);
		if (results.next()) {
			project.setName(results.getString("name"));
			project.setToDate(Objects.requireNonNull(results.getDate("to_date")).toLocalDate());
			project.setFromDate(Objects.requireNonNull(results.getDate("from_date")).toLocalDate());
			project.setId(results.getLong("project_id"));
			return project;
		}
		return null;
	}

	@Override
	public void deleteProject(Long projectId) {
		String delete = "DELETE FROM project_employee WHERE project_id = ?;";
		jdbcTemplate.update(delete, projectId);
		String sql = "DELETE FROM project WHERE project_id = ?;";
		jdbcTemplate.update(sql, projectId);
	}

	private Project MapProjectsToRow(SqlRowSet input) {
		Project project = new Project();
		if (input.getDate("from_date") != null) {
			project.setFromDate((input.getDate("from_date")).toLocalDate());
		}
		project.setId(input.getLong("project_id"));
		project.setName(input.getString("name"));
		if (input.getDate("to_date") != null) {
			project.setToDate((input.getDate("to_date")).toLocalDate());
		}
		return project;
	}
	

}
