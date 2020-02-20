package com.sanket;

import java.util.*;

public class SortString {
    
	public static String sort(String s)
	{
		char a[]=s.toCharArray();
		Arrays.sort(a);
		return new String(a);
		
	}
	public static void main(String...args)
	{
		String str="helloworld";
		
		System.out.println("Input string is:"+str);
		String str1=sort(str);
		System.out.println("Updated String is:"+str1);	
	}
}
