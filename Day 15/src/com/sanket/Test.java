package com.sanket;

public class Test {
 
	public static void main(String args[])
	{
	//	Ride b=new Ride();
	//	Over a=new Over();
		Over a1=new Ride();
		a1.display();
	}
}
 class Over
 {
	 int x=10;
	 public void display()
	 {
		 
		 System.out.println("Class A");
	 }
	 }
 class Ride extends Over
 {  @Override
	 public void displays()
	 {
		 System.out.println("Class B");
	 }
 }