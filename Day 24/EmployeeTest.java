package com.employee;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;



public class EmployeeTest {

	//private static Employee employee;
	private static EmployeeDAO empDAO;
	
	
	@BeforeClass
	public static void init()
	{
		//employee=new Employee();
		empDAO=new EmployeeDAOImpl();
		System.out.println("Object created");
	}
	
	@Ignore
	@Test
	public void add_employee_succes()
	{
		Employee emp=new Employee(1,"Rajshree","Indore",22,5565656);
		assertEquals(true,empDAO.saveEmployee(emp));
	}
	
	@Ignore
	@Test(expected= MySQLIntegrityConstraintViolationException.class)
	public void test_add_employee_fail() {
		Employee emp=new Employee(1,"Rajshree","Indore",22,5565656);
		assertEquals(true,empDAO.saveEmployee(emp));
	}
	
	@Ignore
	@Test
	public void get_employee_byid() throws SQLException
	{ 
			
		assertEquals("ABCD",empDAO.getEmployeeById(133).getName());
	}
	
	@Ignore
	@Test
	public void delete_employee() throws Exception
	{
		Employee emp = empDAO.getEmployeeById(1);
		//String str=emp1.getName();
		assertEquals(true,empDAO.deleteEmployee(emp));
	}
	
	@Ignore
	@Test
	public void update_employee() throws Exception
	{
		Employee emp = empDAO.getEmployeeById(6);
		emp.setAddress("Nala Sopara");;
		assertEquals(true,empDAO.updateEmployee(emp));
	}
	
	@Ignore
	@Test
	public void get_all_employees() throws SQLException {
		List<Employee> list=empDAO.getAllEmployees();
		list.forEach(System.out::println);
	}
	

}
