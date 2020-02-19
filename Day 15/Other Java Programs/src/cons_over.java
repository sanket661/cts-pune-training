
public class cons_over {
String name;
int age;
String address;
public void cons_over(String name, int age){
	this.name=name;
	this.age=age;
	
}
public void cons_over(String name, int age, String add){
	this.name=name;
	this.age=age;
	this.address=add;
}
void display(){
	System.out.println("Name: \t"+name+"Age: \t"+age+"address"+address);
}
public static void main(String args[])
{
	cons_over c=new cons_over();
    c.cons_over("Manish",20);
	c.display();
	c.cons_over("SAnket",21,"Sion");
	c.display();
	
}
}
