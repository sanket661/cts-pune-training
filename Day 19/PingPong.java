
public class PingPong {
	 public static void main(String args[]) throws InterruptedException
	 {
		 Ping p1=new Ping();
		 Pong p2=new Pong();
		 Thread p3=new Thread(p1);
		 Thread p4=new Thread(p2);
		 System.out.print("Player 1 ready...\n" + 
		 		"Player 2 ready...\n");
		 p3.start();
		 p4.start();
		 p3.join();
		 p4.join();
		 
}
}

