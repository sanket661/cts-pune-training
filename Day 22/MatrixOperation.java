package com.ArrayQues;

public class MatrixOperation {
  public static void Sum_Rows(int a[][])
  {
	  System.out.println("Sum of rows is: ");
	     for(int i=0;i<3;i++)
		 {   int sum=0;
			 for(int j=0;j<3;j++)
			 {   
				 sum=sum+a[i][j];
			  
			  
			 }System.out.println("Sum of "+(i+1)+"row is: "+sum);
			 
		 }
  }
  public static void Sum_Cols(int a[][])
  {
	  System.out.println("Sum of column is: ");
		 for(int i=0;i<3;i++)
		 {   int sum=0;
			 for(int j=0;j<3;j++)
			 {   
				 sum=sum+a[j][i];
			  
			  
			 }System.out.println("Sum of "+(i+1)+"column is: "+sum);
			 
		 }
  }
  public static void Sum_Diagonals(int a[][])
  {   int sum=0;
	 
		 for(int i=0;i<3;i++)
		 {   
			 for(int j=0;j<3;j++)
			 {
				 if(i==j)
					 sum=sum+a[i][j];
			 }
		 }
		 System.out.println("Sum of Diagonals is: "+sum);
  }
  public static void Sum_Div(int a[][])
  {
	  int sum=0;
	  for(int i=0;i<3;i++)
		 {   
			 for(int j=0;j<3;j++)
			 {
				 if( a[i][j]%2==0 || a[i][j]%3==0)
					 sum=sum+a[i][j];
			 }
		 }System.out.println("Sum of the no which is divisible by 2 and 3 is :"+sum);
  }
  public static void main(String...args)
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
	   Sum_Rows(a);
	   Sum_Cols(a);
	   Sum_Diagonals(a);
	   Sum_Div(a);
  }
  
}
