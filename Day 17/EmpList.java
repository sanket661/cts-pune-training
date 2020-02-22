package com.sanket;

import java.util.ArrayList;
import java.util.Collections;

public class EmpList {
   public static void main(String args[])
   {
	   ArrayList<Employee> list=new ArrayList<>();
	   
	   Employee e1=new Employee(101, 21,"Sanket", "Sion","PAT",25000);	  
	   Employee e2=new Employee(103, 22,"Nimish", "Borivali","PAT",23000);
	   Employee e3=new Employee(102, 27,"Manish", "Badlapur","PAT",24000);
	   Employee e4=new Employee(104, 22,"Sanjay", "Indore","PAT",25000);
	   
	   list.add(e1);
	   list.add(e2);
	   list.add(e3);
	   list.add(e4);
	   
	   //System.out.println(list);
	//  Collections.sort(list);
	 // Collections.sort(list, new SortByName());
	  Collections.sort(list, new SortByDesignation());
	   for(Employee emp : list)
	   {
		   System.out.println(emp);
	   }
	   
   }
}
