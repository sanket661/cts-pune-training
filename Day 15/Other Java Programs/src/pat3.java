import java.util.*;


public class pat3 {
	public static void main(String args[])
	 {
		 int s1,s2,s3,s4,total=0;
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter marks of 1st subject out of 100=");
		 s1=sc.nextInt();
		 System.out.println("Enter marks of 2nd subject out of 100=");
		 s2=sc.nextInt();
		 System.out.println("Enter marks of 3rd subject out of 100=");
		 s3=sc.nextInt();
		 System.out.println("Enter marks of 4th subject out of 100=");
		 s4=sc.nextInt();
		 total=(s1+s2+s3+s4);
		 float avgs=(total/4);
		 System.out.println("Total of marks ="+total);
		 System.out.println("Average of marks ="+avgs);
		 if(avgs>=75 )
		 {
			 System.out.println("Your grade is A");
		 }else if(avgs>=60 || avgs<75)
		 {
			 System.out.println("Your grade is B");
		 }else if(avgs>=40 ||avgs<40)
		 {
			 System.out.println("Your grade is C");
		 }else{
			 System.out.println("Fail");
		 }
		 
		 
	 }
}
