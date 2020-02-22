package com.sanket.book;

import java.util.ArrayList;

public class prefix10count {
	public static void main(String[] args) {

		 String[] ip={"100","111","10100","10","1111"};

		 getCount(ip);

		}

		public static void getCount(String[] ip) {

		 int op=0;

		 ArrayList<String> arr=new ArrayList<String>();

		 for(String s:ip)

		 if(s.startsWith("10") || s.startsWith("01") &&(s.length()>2))

		 arr.add(s);

		 op=arr.size();

		 System.out.println(op);

		}
}
