package com.sanket;

public class Str {
	public static void main(String...args) {
		String city1="Pune";
		String city2="Mumbai";
		String city3="Pune";
		String city4= new String("Pune");
		String city5= new String("Mumbai");
		String city6= new String("Pune");
		
		System.out.println(city1==city3);
		
		System.out.println(city3.contentEquals(city6));
		
		System.out.println(city1.length());
		
		String msg="  I am an Engineer ";
		String year=" of 2019 ";
		msg=msg.concat(year);
		System.out.println(msg);
		
		String str=msg.substring(2,6);
		System.out.println(str);
		
		String str1=msg.substring(8,16);
		System.out.println(str1);
		
		char ch=msg.charAt(3);
		System.out.println(ch);
		
		int a=msg.indexOf('a');
		System.out.println(a);
		
		int b=msg.lastIndexOf('e');
		System.out.println(b);
		
		char ch2[] ="welcome to pune".toCharArray();
		System.out.println(ch2);
		
		System.out.println(msg.toLowerCase());
		System.out.println(msg.toUpperCase());
		
		System.out.println(msg.trim());
	}
}
