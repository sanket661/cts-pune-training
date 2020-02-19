import java.util.*;

public class AlphPattern1 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of pattern:");
		int n=sc.nextInt();
		int ASC=65;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)ASC+"");
			}
			ASC++;
			System.out.println("");
		}
		
		
	}
	
	
}
