
public class pat4 {
 public void pattern(int n)
 { int i,j;
	 for(i=1;i<=n;i++)
	 {
		 for(j=1;j<=(2*n);j++)
		 {
			 if(i>(n-j+1))
				 System.out.print(" ");
			 else
				 System.out.print("*");
			 
			 if((i+n)>j)
			     System.out.print(" ");
			 else
				 System.out.print("*");
		 }System.out.println("");
	 }
	 for(i=1;i<=n;i++)
	 {
		 for(j=1;j<=(2*n);j++)
		 {
			 if(i<j)
				 System.out.print(" ");
			 else
				 System.out.print("*");
			 
			 if(i<=((2*n)-j))
				 System.out.print(" ");
			 else
				 System.out.print("*");
				 
		 }
		 System.out.println("");
	 }
 }
 public static void main(String args[])
 {
	 pat4 a=new pat4();
	 a.pattern(7);
 }
}
