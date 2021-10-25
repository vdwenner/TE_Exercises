package com.techelevator.projects.dao;

import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM employee";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		List<Employee> row = new ArrayList<>();
		while(results.next()) {
			row.add(MapRowToEmployee(results));
		}
		return row;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employee = new ArrayList<>();
		String sql = "SELECT first_name, last_name, hire_date, birth_date, employee_id, department_id FROM employee WHERE first_name ILIKE ? AND last_name ILIKE ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, "%" + firstNameSearch + "%", "%" + lastNameSearch + "%");
		while (results.next()) {
			employee.add(MapRowToEmployee(results));
		}
		return employee;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		List<Employee> employee = new ArrayList<>();
		String sql = "SELECT E.employee_id, E.department_id, E.first_name, E.last_name, E.birth_date, E.hire_date FROM employee E INNER JOIN project_employee PE ON E.employee_id = PE.employee_id WHERE PE.project_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while (results.next()) {
			employee.add(MapRowToEmployee(results));
		}
		return employee;
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String sql = "INSERT INTO project_employee (project_id, employee_id) VALUES (?, ?);";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String sql = "DELETE FROM project_employee WHERE project_id = ? AND employee_id = ?;";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employee = new ArrayList<>();
		String sql = "SELECT * FROM employee e LEFT JOIN project_employee pe ON pe.employee_id = e.employee_id WHERE pe.project_id IS NULL;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()){
			employee.add(MapRowToEmployee(results));
		}
		return employee;
	}

	private Employee MapRowToEmployee(SqlRowSet input) {
		Employee employee = new Employee();
		employee.setFirstName(input.getString("first_name"));
		employee.setLastName(input.getString("last_name"));
		employee.setDepartmentId(input.getLong("department_id"));
		employee.setId(input.getLong("employee_id"));
		employee.setHireDate(input.getDate("hire_date").toLocalDate());
		employee.setBirthDate(input.getDate("birth_date").toLocalDate());
		return employee;
	}


}
