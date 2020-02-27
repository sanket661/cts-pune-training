package com.ArrayQues;

public class SumOfColumn {
	public static void main(String args[])
	{ 
	   int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	   System.out.println("Matrix is");
	   for(int i=0;i<3;i++)
	   {
		  for(int j=0;j<3;j++)
		  {
			 System.out.print(a[i][j]+" ");
		  }System.out.println();
	   }
	   System.out.println("Sum of column is: ");
		 for(int i=0;i<3;i++)
		 {   int sum=0;
			 for(int j=0;j<3;j++)
			 {   
				 sum=sum+a[j][i];
			  
			  
			 }System.out.println("Sum of "+(i+1)+" is: "+sum);
			 
		 }
	}
}
