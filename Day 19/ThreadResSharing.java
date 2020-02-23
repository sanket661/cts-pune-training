package com.thread;

public class ThreadResSharing {
	public static void main(String...args)
	{   Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);
		System.out.println(Thread.currentThread().getName());
		Resource res=new Resource();
		ThreadOne threaddemo=new ThreadOne(res);
		ThreadTwo threadtwo=new ThreadTwo();
		Thread t1=new Thread(threaddemo);
		Thread t2=new Thread(threadtwo);
		
		t1.start();
		t2.start();
	}
}
