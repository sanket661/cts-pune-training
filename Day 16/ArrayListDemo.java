package com.sanket;

import java.util.*;

public class ArrayListDemo {
   public static void main(String args[])
   {
	   ArrayList<String> list=new ArrayList<>();
	   //List list=new ArrayList();
	   list.add("hello");
	   list.add("To");
	   list.add("java");
	   list.add("batch");
	   list.add("007");
	   list.add("true");
	 //  Iterator<String> it=list.iterator();
	   ListIterator<String> it=list.listIterator();
	   System.out.println("******Forward Direction******");
	   while(it.hasNext())
	   {
		   String element=it.next();
		   System.out.println(element);
		   if(element.equals("java"))
			   break;
		   
	   }
	   System.out.println("******Backward Direction******");
	   while(it.hasPrevious())
	   {
		   String element=it.previous();
		   System.out.println(element);
	   }
	   
	   
	   
	   System.out.println(list);
	   list.remove(2);
	   list.add(2,"Advanced Java");
	   System.out.println("List contains Python?:"+list.contains("python"));
	   for(String obj: list)
	   {
		   System.out.println(obj); 
		  if(obj.equals("Java"))
		  {
			  break;
		  }		  		  
	   }	   
   }
}
