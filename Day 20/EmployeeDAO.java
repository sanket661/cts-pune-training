package com.employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

	public boolean saveEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(Employee employee);
	public Employee getEmployeeById(int id) throws SQLException;
	public List<Employee> getAllEmployees() throws SQLException;
	
}
