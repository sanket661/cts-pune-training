package com.sanket.book;

import java.util.*;

//Generate a series of first 10 number as follows   36,34,30,28,24,22,18,16,12,10
public class series1 {
	public static void main(String[] args) {
		int a = 10;
		ArrayList<Integer> seri = new ArrayList<Integer>();
		System.out.println("Enter Total number of elements you want in series");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i = 0;i <= n;i++) {
			if(i%2==0) {
				a += 2;
				seri.add(a);
				
			}else {
				a += 4;
				seri.add(a);
			}
		}
		for(int i=0;i < seri.size() / 2; i++)	
			{
			    Integer temp = seri.get(i);
			    seri.set(i, seri.get(seri.size() - i - 1)); 
	            seri.set(seri.size() - i - 1, temp); 
			    
			}System.out.println(seri);
			
	}
}

