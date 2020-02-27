package com.ArrayQues;

import java.util.Scanner;

public class SumofArray {
	public static void main(String...args) throws Exception
	{   int n, sum=0;
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
		
		for(int i=0;i<n;i++)
		{
			sum+=a[i];	
		}
		System.out.println("Sum of all elements stored in the array is :"+sum);
	}
}
