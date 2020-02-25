import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;


public class JdbcDemo {

	public static void main(String args[]) throws Exception
	
	{   
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Enter employee id: ");
//		int id=Integer.parseInt(br.readLine());
//		System.out.print("Enter employee name: ");
//		String name=br.readLine();
//		System.out.print("Enter employee addr: ");
//		String address=br.readLine();
//		System.out.print("Enter employee age: ");
//		int age=Integer.parseInt(br.readLine());
//		System.out.print("Enter employee phone no: ");
//		Long phone=Long.parseLong(br.readLine());
		
		//1.load database driver
		//1.1 by using forName() method
		Class.forName("com.mysql.jdbc.Driver");
		
		//1.2
		//Driver driver=new com.mysql.jdbc.Driver()
		
		//2.Establish the connection		
		String url="jdbc:mysql://localhost:3306/jdbcExample";//add localhost or system ip address 126.0.0.1
		Connection conn=DriverManager.getConnection(url, "root","root");
		Statement stmt=conn.createStatement();
		
		
//		System.out.println(conn.getClass().getName());
//		Execute SQL Queries
		
//		String query="insert into employee values(4,'vijay','nalasopara',24,7039485555)";
//		String query="update employee set address='Badlapur' where id=3";
//		String query="delete from employee where id=1";
//		String query="select * from employee";
//		int result= stmt.executeUpdate(query);
//		String query="create table customer"+"(cid int primary key,"+"cname varchar(50),"+"cphone long)";
//		stmt.executeUpdate(query);
//		if(stmt!=null)
//            conn.close();
//    	String query1="insert into customer values(1,'nimish',7039485555)";
//    	String query2="insert into customer values(2,'sanjay',7039485555)";
//    	String query3="insert into customer values(3,'sagar',7039485555)";
//    	stmt.executeUpdate(query1);
//    	stmt.executeUpdate(query2);
//   	stmt.executeUpdate(query3);
		
//		String query="update customer set cphone=12345679 where cid=1";
//		stmt.executeUpdate(query);
//	
//	ResultSet rs= stmt.executeQuery(query);
//		while(rs.next())
//		{
//			int id=rs.getInt(1);
//			String name=rs.getString(2);
//			String address=rs.getString(3);
//			int age=rs.getInt(4);
//			long phone=rs.getLong(5);
//			System.out.println(id+" : "+name+" : "+address+" : "+age+" : "+phone);
//			
//		} 
//			
//				if(result>0)
//			         System.out.println("Record inserted succesfully");
//	            else
//		             System.out.println("Something went wrong   ");
//		
//		String query="insert into employee values(?,?,?,?,?)";
//		String query="update employee set name=? where id=?";
//		String query="delete from employee where id=?";
		String query="select * from employee";
		ResultSet rs= stmt.executeQuery(query);
		PreparedStatement ps=conn.prepareStatement(query);
//      ---------------INSERT----------------------
//		ps.setInt(1, id);  
//		ps.setString(2, name);		
//		ps.setString(3, address);
//		ps.setInt(4, age);insert
//		ps.setLong(5, phone);
//      ----------------UPDATE-------------------
//		ps.setString(1, name);
//		ps.setInt(2, id);   
//      ----------------DELETE--------------------
//		ps.setInt(1,id);
//		int i=ps.executeUpdate();
//      ------------------Fetch--------------------
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String address=rs.getString(3);
			int age =rs.getInt(4);
			long phone=rs.getLong(5);
			System.out.println(id+" : "+name+" : "+address+" : "+age+" : "+phone);
		}
		
//		if(i>0)
//		   System.out.println("Data updated succesfully");
//		else 
//			System.out.println("Try again");
		   

	}
	
}
