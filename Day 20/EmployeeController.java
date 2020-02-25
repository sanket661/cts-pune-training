package com.employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeController {

	public static void main(String args[]) throws SQLException
	{
		EmployeeDAO empObj=new EmployeeDAOImpl();
		List<Employee> list=empObj.getAllEmployees();
		 //list.forEach(System.out::println);
		Employee e1=empObj.getEmployeeById(6);
        System.out.println(e1);
//		Employee employee=new Employee(6,"Vijay","Mumbai",22,9993016);
//		empObj.saveEmployee(employee);
	}	
}
