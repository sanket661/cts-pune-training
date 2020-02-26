package com.sanket;

import java.util.Scanner;

public class Task1 {

	public static void main(String...args)
	{
		int flag=1,d,sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0 || sum>9)
		{   if(n==0) {
			 flag++;
			  n=sum;
			  sum=0;
		    }
			d=n%10;
			sum +=d;
		    n=n/10;
     	   
//			if(sum>9 ) 
//			{
//				flag++;
//			}
			
			
		}
	    System.out.println("Output is :"+flag);
	}

}
