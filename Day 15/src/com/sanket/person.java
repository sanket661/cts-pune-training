package com.sanket;

public class person {
	
   
   public void display(int id,int no,String name)
   {
	  System.out.println("\n Person id: \t"+id+"\t Name: "+name+" \t No is: "+no); 
   }
   public static void main(String args[])
	{
		Manager m=new Manager();
		m.display(20000, 5000);
		m.display(50000,10000);
		m.display(101, "Manager");
		m.display(11,101010, "Sanket");
	}
}
class Emp extends person
{
	
	
	public void display(int eid,String Des) {
		System.out.println("\n emp id is:  \t"+eid+" \t Designation is: "+Des);
	}
}
class HR extends Emp{
	public void display(int salary, float bonus)
	{   
		System.out.println("\n Salary for HR is: \t"+salary+"\t Bonus is:"+bonus);
	}
}
class Manager extends Emp{
	public void display(int msalary, int bonus)
	{ 
		System.out.println("\n Salary for Manager is: \t"+msalary+"Bonus salary is: "+bonus);
	}
	
}