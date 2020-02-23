
public class Main {
 public static void main(String args[])
 {
	 Table1 t1=new Table1();
	 Table2 t2=new Table2();
	 Thread t3=new Thread(t1);
	 Thread t4=new Thread(t2);
	 t3.start();
	 try {
		t3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 t4.start();
	 
	 
 }
}
