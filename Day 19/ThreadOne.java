package com.thread;

public class ThreadOne implements Runnable{
   
	Resource res;
	public ThreadOne(Resource res) {
		this.res=res;
	}
	@Override
	public void run() {
		try {
			res.display("Thread 1");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}    
	/*public static void main(String...args)
	{   Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);
		System.out.println(Thread.currentThread().getName());
		
		ThreadDemo threaddemo=new ThreadDemo();
		ThreadTwo threadtwo=new ThreadTwo();
		Thread t1=new Thread(threaddemo);
		Thread t2=new Thread(threadtwo);
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		//for(int i=1;i<=10;i++)
		//{
		//	System.out.println(Thread.currentThread().getName()+" : "+i);
		//}
		System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());
		System.out.println("Thread-1 priority: "+t1.getPriority());
		System.out.println("Thread-2 priority: "+t2.getPriority());
		
		
	}*/
	
	


