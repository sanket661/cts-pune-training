package com.task;
import java.util.*;
public class T9 {
	public static void main(String...args) {
		int n,d=0,a,b;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		a=n;
		while(n!=0)
		{
			b=n%10;
			d=d*10+b;
			n/=10;
		}
		if(a==d)
			System.out.println("No is palindrome");
		else
			System.out.println("No is not palindrome");
		
	}
}
