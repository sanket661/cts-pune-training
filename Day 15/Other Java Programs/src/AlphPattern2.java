import java.util.*;
public class AlphPattern2 {
  public static void main(String args[])
  {
	  int i,j,n, asc=65;
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  for(i=0;i<n;i++)
	  {
		  for(j=0;j<=i;j++)
		  {
			  System.out.print((char)(asc+j)+"");
		  }
		  
		  System.out.println("");
	  }
  }
}
