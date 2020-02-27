package com.ArrayQues;

import java.util.Scanner;

public class CopyArray {


	public static void main(String...args) throws Exception
	{   int n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("The elements stored in the first array are : " );
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<n;i++)
		{
			int temp=a[i];
			a[i]=b[i];
			b[i]=temp;
		}
		System.out.println("The elements copied into the second array are : " );
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}
