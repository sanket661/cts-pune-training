package com.employee;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import  com.employee.EmployeeDAO;
import com.mysql.jdbc.PreparedStatement;

public class EmployeeDAOImpl implements EmployeeDAO{

	Connection conn=getConnection();
	java.sql.PreparedStatement ps=null;
	
	private Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbcExample";
			conn=DriverManager.getConnection(url, "root","root");
			return conn;
			}
		catch(Exception e) {
			return null;
		}
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		String query="insert into employee values(?,?,?,?,?)";
		try {
			ps=conn.prepareStatement(query);
			ps.setInt(1,employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4,employee.getAge());
			ps.setLong(5, employee.getPhone());
			ps.executeUpdate();
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		
		return false;
	}

	@Override
	public Employee getEmployeeById(int id)  {
		String query="select * from employee where id=?";
		try {
		Employee emp=null;
		Statement stmt=conn.createStatement();
			ps=conn.prepareStatement(query);
			ps.setInt(1,id);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			emp=new Employee();
			emp.setId(rs.getInt("id"));
            emp.setName(rs.getString("name"));
            emp.setAge(rs.getInt("age"));
            emp.setAddress(rs.getString("address"));
            emp.setPhone(rs.getLong("phone"));
		}
		
		return emp;
	}catch(SQLException e)
		{
		 e.printStackTrace();
		}return null;
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		    List<Employee> employees = new ArrayList<Employee>();
            String sql = "select * from employee";
             try {
            ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setAge(rs.getInt("age"));
                emp.setAddress(rs.getString("address"));
                emp.setPhone(rs.getLong("phone"));
                employees.add(emp);
            }
            return  employees;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;		
	}	
}
	
	
	
	
	
	
	
	
	

