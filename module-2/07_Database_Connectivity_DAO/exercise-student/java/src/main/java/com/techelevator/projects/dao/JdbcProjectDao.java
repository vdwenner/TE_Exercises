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
		return new Project(0L, "Not Implemented Yet", null, null);
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<>();
		String sql = "SELECT DISTINCT pe.project_id, name, from_date, to_date, employee_id FROM project p INNER JOIN project_employee pe ON pe.project_id = p.project_id ;\n";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			projects.add(MapProjectsToRow(results));
		}
		return projects;
	}

	@Override
	public Project createProject(Project newProject) {
		Project project = new Project();

		String sql = "UPDATE project SET name = ?, from_date = ?, to_date = ?";
		jdbcTemplate.update(sql, newProject.getName(), newProject.getFromDate(), newProject.getToDate());
		return project;
	}

	@Override
	public void deleteProject(Long projectId) {

	}

	private Project MapProjectsToRow(SqlRowSet input) {
		Project project = new Project();
		project.setFromDate((input.getDate("from_date")).toLocalDate());
		project.setId(input.getLong("project_id"));
		project.setName(input.getString("name"));
		project.setToDate((input.getDate("to_date")).toLocalDate());
		project.setId(input.getLong("employee_id"));
		return project;
	}
	

}
