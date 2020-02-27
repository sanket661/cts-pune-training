package com.ArrayQues;

import java.util.Scanner;

public class SumOfRows {
 public static void main(String args[])
 {   
	 int[][] a=new int[3][3];
	 Scanner sc=new Scanner(System.in);
	// System.out.println("Matrix is");
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			 a[i][j]=sc.nextInt();
		 }
	 }sc.close();
	 System.out.println("Matrix is");
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			 System.out.print(a[i][j]+" ");
		  }System.out.println();
	 }
	 System.out.println("Sum of rows is: ");
	 for(int i=0;i<3;i++)
	 {   int sum=0;
		 for(int j=0;j<3;j++)
		 {   
			 sum=sum+a[i][j];
		  
		  
		 }System.out.println("Sum of "+(i+1)+" is: "+sum);
		 
	 }
	 
 }
}
