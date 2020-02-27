package com.ArrayQues;

import java.util.Scanner;

public class DuplicateInArray {
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
		for(int i=1;i<n;i++)
		{
			if(a[i]==a[i-1])
			{
				System.out.println("Total number of duplicate elements found in the array is :"+a[i]);
			}
		}
		
	}
}
