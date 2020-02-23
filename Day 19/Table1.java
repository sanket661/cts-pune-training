
public class Table1 implements Runnable{
	
   synchronized public void run()
   {
	   for(int i=1;i<=10;i++)
	   {
		   System.out.println((2*i)+" : "+Thread.currentThread().getName());
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	   }
   }
	
	
}
