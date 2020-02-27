package com.ArrayQues;

import java.util.Scanner;

public class RevArray {

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
		
		System.out.println("The values store into the array in reverse are :");
		for(int i=n;i>0;i--)
		{
			System.out.println(a[i]);
		}
	    
	}

}
