package com.employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeController {

	public static void main(String args[]) throws SQLException
	{   ArrayList<Employee> list=new ArrayList<Employee>();
		EmployeeDAO empObj=new EmployeeDAOImpl();
	//	List<Employee> list=empObj.getAllEmployees();
		 //list.forEach(System.out::println);
//		Employee e1=empObj.getEmployeeById(4);
//		list.forEach(System.out::println);
     //   System.out.println(e1);
//		Employee employee=new Employee(6,"Vijay","Mumbai",22,9993016);
//		empObj.saveEmployee(employee);
//		Employee e1=empObj.getEmployeeById(4);
//		empObj.deleteEmployee(e1);
		Employee e1=empObj.getEmployeeById(6);
		e1.setAddress("kerala");
		empObj.updateEmployee(e1);
		
		//list.forEach(System.out::println);
		
		
		
		
	}	
}
