package com.ArrayQues;

public class LambdaExpression {

	public static void main(String...args)
	{   //Runnable example with lambda expressions
//		Runnable r=() -> System.out.println("Hello runnable");
//		Thread t=new Thread(r);
//		t.start();
		
		//runnable thread proper method
//		myThread t=new myThread();
//		Thread t1=new Thread(t);
//		t1.start();
		
		Hello h = () -> "Good Morning";
		System.out.println(h.greetings());
		
		Hello h1 = () -> "Good Afternoon";
		System.out.println(h1.greetings());
		
		Hello h2 = () -> "Good Evening";
		System.out.println(h2.greetings());
		
		Hello h3 = () -> "Good Night";
		System.out.println(h3.greetings());
		
	}
}
@FunctionalInterface //It is used to check whether interface has one method only
interface Hello
{
	String greetings();
//	public void display();
}


//class myThread implements Runnable
//{
//
//	@Override
//	public void run() {
//	System.out.println("Hello runnable");
//		
//	}
	
