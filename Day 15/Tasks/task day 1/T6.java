package com.task;
import java.util.*;
public class T6 {
	public static void main(String...args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if(n % 2 == 0)
            System.out.println(n+" is even no");
        else
            System.out.println(n+" is odd no");
    }
}
