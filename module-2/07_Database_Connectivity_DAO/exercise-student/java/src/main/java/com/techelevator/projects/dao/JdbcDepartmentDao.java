package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(Long id) {
		Department department = new Department();
		String sql = "SELECT department_id, name FROM department WHERE department_id = ? OR department_id IS NULL;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
		while (results.next()) {
			department.setId(results.getLong("department_id"));
			department.setName(results.getString("name"));
			return department;
		}
		return null;


	}


	@Override
	public List<Department> getAllDepartments() {
		List<Department> department = new ArrayList<>();
		String sql = "SELECT * FROM department;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			department.add(MapRowToDepartment(results));
		}
		return department;
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {
		String sql = "UPDATE department SET name = ? WHERE department_id = ?;";
		jdbcTemplate.update(sql, updatedDepartment.getName(), updatedDepartment.getId());
	}

	private Department MapRowToDepartment(SqlRowSet input) {
		Department department = new Department();
		department.setId(input.getLong("department_id"));
		department.setName(input.getString("name"));
		return department;
	}

}
