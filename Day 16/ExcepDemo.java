package com.sanket;

public class ExcepDemo {
  public static void divideNumber(int a,int b) throws CustomException
  {
	  if(b>0)
	  {
		  System.out.println(a/b);
		  
	  }else {
		  throw new CustomException();
	  }
  }
  public static void main(String...args)
  {
	  try {
		  divideNumber(4,0);
		  
	  }catch(CustomException ex)
	  {
		  System.out.println(ex.getmessage("Divide by Zero"));
	  }
  }
}
  class Customexception
  {
	  public void Customexception()
	  {
		  
	  }
  }




