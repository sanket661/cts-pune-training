
public class overloading {
 
	 int mymethod(int x, double d)
	 {
		double a=x+d;
		System.out.println("method 1");
		return (int)a;
	 }
	 void mymethod(int x, String y)
	 {
		 System.out.println("method2"+y);
	 }
	 void mymethod(int x)
	 {
		 System.out.println("method 3"+x);
	 }
	 void mymethod(int x,int y)
	 {
		 System.out.println("method 4"+y);
	 }
 
 public static void main(String args[])
 {
	 overloading ab=new overloading();
	 ab.mymethod(5,"sanket");
	 ab.mymethod(5,3.0);
	 ab.mymethod(5);
	 ab.mymethod(5,4);
	 
	 
 }
}
