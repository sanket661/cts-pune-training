import java.util.*;
public class CTest {
  public static void main(String args[])
  {
	  int n,sum=0;
	  Scanner sc=new Scanner(System.in);
	  do{
		  System.out.print("Enter a number:");
		  n=sc.nextInt();
		  sum+=n;
		}while(n!=0);
	  System.out.println("Sum="+sum);
  }
}
