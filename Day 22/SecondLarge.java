package com.ArrayQues;

import java.util.Scanner;

public class SecondLarge {
	public static void main(String...args) throws Exception
	{   int n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("The values store into the array are :" );
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		int max=a[0];
		int second_max=a[0];
		for (int i = 0; i < n; i++) {
			 
			if (a[i] > max) {
				second_max = max;
				max = a[i];
 
			} else if (a[i] > second_max) {
				second_max = a[i];
 
			}
		}
		System.out.println("Secong largest no is: "+second_max);	
		  
			  
		
	}
}
