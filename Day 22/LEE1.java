package com.ArrayQues;

public class LEE1 {

	public static void main(String...args)
	{
		Calculator add=(a,b)->a+b;
		System.out.println(add.calculate(10, 8));
		Calculator sub=(a,b)->a-b;
		System.out.println(sub.calculate(100, 71.45));
		Calculator mul=(a,b)->a*b;
		System.out.println(mul.calculate(9,11));
		Calculator div=(a,b)->a/b;
		System.out.println(div.calculate(44, 8));
	}
}
@FunctionalInterface
interface Calculator{
	double calculate(double a,double b);
}