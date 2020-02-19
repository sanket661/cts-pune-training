package com.sanket;
import java.util.*;
public class CountOne {
	public static void main(String...args) {
		
	
   int a,b, count=0,i;
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   sc.close();
   System.out.println("Total no of 1s between "+a+" and  "+b+" is");
   for(i=a;i<=b;i++)
   {
	   String n=String.valueOf(i);
	   while(n.contains("1"))
       {
           n= n.substring(n.indexOf("1")+1);
           count++;
       }
   }
   System.out.println(count);
	}
}
