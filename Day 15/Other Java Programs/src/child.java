
public class child extends parent{
  public child(){
	  super();
  }
  public child(String name, int age, String address)
  {
	  super(name,age,address);
  }
  public static void main(String args[])
  {
	  child c=new child();
	  c.parentDisplay();
	  child c2=new child("sanket",22,"mumbai");
	  c2.parentDisplay();
  }
  
}
