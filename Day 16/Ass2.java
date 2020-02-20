package com.sanket;

public class Ass2 {

 public static void main(String...args)
 {
	 String str="Java programming is easy";
	 System.out.println("Input String is"+str);
	
	 for(int i=0;i<=str.length()-1;i++)
		{
			
			if(i%2==0)
				System.out.print(Character.toUpperCase(str.charAt(i)));
			else
				System.out.print(Character.toLowerCase(str.charAt(i)));	 
        }
  }}

