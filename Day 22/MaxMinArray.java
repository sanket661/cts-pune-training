package com.ArrayQues;

import java.util.Scanner;

public class MaxMinArray {
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
		for(int i=1;i<n;i++)
		{
		   if(a[i]>max )
		   {
			   max = a[i];
		   }
		}	System.out.println("Maximum no is" +max);	
		int min=a[0];
		for(int i=1;i<n;i++)
		{
		   if(a[i]<min )
		   {
			   min = a[i];
			   
		   }
		}	System.out.println("Minimum no is" +min);	
	}
}
