
public class MainThread {
   
	public static void main(String...args)
	{
		Thread t=Thread.currentThread();
		System.out.println(t);
		//Thread[main,5,main] main- name of main thread, 5 is normal priority, main name of demon thread
		System.out.println(t.getName());
		t.setName("Thread 1");
		System.out.println(t);
		System.out.println(t.getPriority());
		System.out.println("Is demon? "+t.isDaemon());
		System.out.println("Is alive? "+t.isAlive());
	
		
	}
}
