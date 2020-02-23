package com.thread;

public class Resource {

	public void display(String name) throws InterruptedException 
	{  synchronized (this) {
		
	
		for(int i=1;i<=5;i++) {
		   System.out.println("Name count: "+i+" - " +name);
		   Thread.sleep(1000);
		}
	}
}
}