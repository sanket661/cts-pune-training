package com.task;

import java.util.*;

public class T5 {
	public static final float pi=3.14f;
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		sc.close();
		System.out.println("Radius is= "+r);
		float area=(pi*r*r);
		System.out.println("Area of circle is = "+area);
	}
}
