package com.task;

public class T7 {
	public static void main(String...args) {
        int  a = 0, b = 1, sum=0;
        System.out.print("Fibonacci Series is:");

        for (int i = 1; i <= 10; ++i)
        {
            System.out.print(a + " , ");
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}
