package com.sanket;

public class Toggle {
	 public static String togg(String str)
	 {  String tog="";
		for(int i=0;i<=str.length()-1;i++)
		{
			char a = str.charAt(i); 
			if(Character.isUpperCase(a))
		       {
		            a = Character.toLowerCase(a); 
		       }
		       else if(Character.isLowerCase(a))
		       {
		           a = Character.toUpperCase(a);
		       } else {  }    
	           tog=tog+a;
	    }
		return tog;   
	 } 
	 public static void main(String...args)
	 {
		 String str="sANKET";
		 System.out.println("Input String is:  "+str);
		 String str1=togg(str);
		 System.out.println("Output String is:  "+str1);
	 }
}
