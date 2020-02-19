/*Consider the string str="Global Warming"
    Write statements in Java to implement the following
    a) To display the last four characters.
    b) To display the substring starting from index 4 and ending at index 8.
    c) To check whether string has alphanumeric characters or not.
    d) To trim the last four characters from the string.
    e) To trim the first four characters from the string.
    f) To display the starting index for the substring "Wa".
    g) To change the case of the given string.
    h) To check if the string is in title case.
    i) To replace all the occurrences of letter "a" in the string with "*"package com.sanket;
*/
package com.sanket;

	 public class Stri {
		 
	public static boolean isTitleCase(String s) {
		boolean result=false;
		String arr[]=s.split("\\s+");
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i].charAt(0);
			if(ch>=65 && ch<=90)
			{
				result= true;
			}
			else {
				result=false;
				break;
			}
		}
		return result;
	}
	
  public static void main(String...args)
  {
	  String str="Global Warming";
	
	  
	  String a=str.substring(10,14);
	  System.out.println(a);
	  
	  
	  String b=str.substring(4,9);
	  System.out.println(b);
	  
	  
	  System.out.println(str.matches("^[a-zA-Z0-9]*$"));
	  
	  
	  String e=str.substring(0,4);
	  System.out.println(e.trim());
	  System.out.println(a.trim());
	  
	  
	  int c=str.indexOf("Wa");
	  System.out.println(c); 
	  
	  
	  System.out.println(str.toLowerCase());
	  
	  
	  System.out.println("Title case is: "+isTitleCase(str));
	  
	  
	  String str1=str.replace('a','*');
	  System.out.println(str1);
  }
}
