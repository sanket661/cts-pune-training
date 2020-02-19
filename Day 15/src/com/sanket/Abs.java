package com.sanket;

class Div {
	public int Div(int a, int b)
	{
		return a/b;
	}
}

interface Add
{
	int add(int a,int b);
	default int mult(int a,int b)
	{
		return a*b;
	}
}

interface Sub extends Add
{
	int sub(int a,int b);
}

public class Abs extends Div implements Sub {
	
  public int add(int a,int b)
  {
	  return a+b;
  }
  
  public int sub(int a,int b)
  {   if(a>b)
	    return a-b;
     else
	    return b-a;
  }
  
  public static void main(String args[])
  {
	 // Abs a=new Abs();
	  Abs a=new Abs();
	  System.out.println(a.add(2, 6));
	  System.out.println(a.sub(100,80));
	  System.out.println(a.Div(180,15));
	  System.out.println(a.mult(10,7));
  }

}
