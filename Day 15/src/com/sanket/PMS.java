package com.sanket;
import java.util.*;
public class PMS {
  public static void main(String args[])
  {
	  Salary s=new Salary();
	  s.getdata1();
	  s.calculate();
	  s.display();
	  
  }
}
class Employee{
	//employee's number, name, designation, address, phone number
	 int eid;
	 String name;
	 String des;
	 String addr;
	 int mno;                   // int eid, String name, String des, String addr, int mno
	
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee id is: ");
		eid=sc.nextInt();
		System.out.println("Employee name is: ");
		name=sc.next();
		System.out.println("Employee Designation is: ");
		des=sc.nextLine();
		System.out.println("Employee address is: ");
		addr=sc.nextLine();
		System.out.println("Employee mobile no is: ");
		mno=sc.nextInt();
		sc.close();
			/* eid=1001;
			name="Sanket";
			des="PAT";
			addr="Sion Koliwada, Mumbai";
			mno=101010;*/
		
	}
	public void putdata()
	{
		System.out.println("employee id:"+eid);
		System.out.println("EMp name:"+name);
		System.out.println("Emp designation:"+des);
		System.out.println("Emp address:"+addr);
		System.out.println("Emp mobile no.:"+mno);
	}
}

class Salary extends Employee{
	float base_pay, DA, HRA, PF,IT,NetPay,GP;
	
	public void getdata1() {
		super.getdata();
		Scanner sc=new Scanner(System.in);
		System.out.println("Basic Pay is: ");
		base_pay=sc.nextFloat();
		System.out.println("DA is : ");
		DA=sc.nextFloat();
		System.out.println("HRA is :");
		HRA=sc.nextFloat();
		System.out.println("PF is:");
		PF=sc.nextFloat();
		IT=sc.nextFloat();
		
		sc.close();
		/* this.base_pay=base_pay;
		this.DA=DA;
		this.HRA=HRA;
		this.PF=PF;
		this.IT=IT;*/ 
		
	}
	
	public void calculate()
	{
		GP=base_pay+DA+HRA;
		NetPay=GP-IT-PF;
	}
	
	public void display()
	{
		super.putdata();
		System.out.println("Salary of employee is:");
		System.out.println("Total salary is="+ NetPay);
	}
}