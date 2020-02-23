
public class Pong implements Runnable{

	 public void run() {
		 synchronized(this) {
    	 for(int i=1;i<=20;i++)
  	   {   if(i%2==0)
    		 System.out.println("<--pong");
  		   try {
  			
  			Thread.sleep(1000);
  			
  		} catch (InterruptedException e) {
  			
  			e.printStackTrace();
  		}
  	   }
    	
    	
    	
    }
	
}
}
