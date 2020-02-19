package com.sanket;
import java.util.*;
public class AB {
	public static void main(String args[])
	 {
		 int n, sum=0, d;
		 Scanner sc= new Scanner(System.in);
		 n=sc.nextInt();
		 sc.close();
		 while(n!=0)
		 {
			 d=n%10;
			 sum+=d;
			 n=n/10;
		 }
		 System.out.println("Sum= "+sum);
	 }
}
