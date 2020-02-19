package com.task;
import java.util.*;
public class T4 {
public static void main(String...args)
{   Scanner sc=new Scanner(System.in);
	int a,b,temp;
	a=sc.nextInt();
	System.out.println("First number = "+a);
	b=sc.nextInt();
    System.out.println("Second number = "+b);    
    sc.close();
    temp=a;
    a=b;
    b=temp;
    System.out.println("First number after swapping = "+a);
    System.out.println("Second number after swapping = "+b);
}
}
