import java.util.*;
public class EmployeeController {
    

	public static void main(String[] args) {
		EmployeeDAOImpl empObj = new EmployeeDAOImpl();
		List<Employee> list=empObj.getAllEmployees();
		
	    int ch;
		String name,address,designation,str = null;
		long phone;
		//Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
		//empObj.addEmployee(emp);
		//list.forEach(System.out::println);
		//System.out.println();
		//System.out.println();
		//empObj.updateEmployee("Sakshi");
		//Employee e=empObj.getEmployeeById(4234);
		//empObj.deleteEmployee(e);
		//Employee em=empObj.getEmployeeById(4234);
		//em.setName("Sanket");
		//list.forEach(System.out::println);
		//List<Employee> list = empObj.getAllEmployees();
		//list.forEach(System.out::println);
		//System.out.println("Employee details by id is: "+empObj.getEmployeeById(4234));
		System.out.println("-------Employee Management-------");
		do {
		System.out.println("Enter your choise");
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Remove Employee");
		System.out.println("4. Get display by id");
		System.out.println("5. Display All");
		System.out.println("6. Exit");
		
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:  int id=Integer.parseInt(str);
			         name=sc.nextLine();
			         address=sc.nextLine();
			         designation=sc.nextLine();
			         int age=Integer.parseInt(str);
			         double salary=Double.parseDouble(str);
			         phone=sc.nextLong();
			         Employee emp=new Employee(id, name, address, designation, age, salary, phone);
			         empObj.addEmployee(emp);
			         list.forEach(System.out::println);
			         break;
			         
			case 2:  int id1=Integer.parseInt(str);
				     Employee em=empObj.getEmployeeById(id1);
				     System.out.println("Enter name to update");
				     String ab=sc.nextLine();
				     em.setName(ab);  
				     list.forEach(System.out::println);
			         break;
			         
			case 3:  System.out.println("Enter id no to delete");
			         int id2=Integer.parseInt(str);
			         Employee e=empObj.getEmployeeById(id2);
			 		 empObj.deleteEmployee(e);
			 		 break;

			case 4:  System.out.println("Enter id to know about employee");
	                 int id3=Integer.parseInt(str);
	                 Employee e1=empObj.getEmployeeById(id3);
	                 list.forEach(System.out::println);
	                 break;
	                 
			case 5:  list.forEach(System.out::println);
			         break;
			
			case 6:  System.exit(0);
			         break;
			default: System.out.println("Enter valid choise");
			         
		}
		
		
	}while(ch!=7);

	
	}
}