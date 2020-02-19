
public class parent {
String name;
String address;
int age;
private String color;
public parent() {
}
public parent(String name, int age, String address) {
	this.name=name;
	this.age=age;
	this.address=address;
	
}
void parentDisplay(){
	System.out.println("name: "+name+"Address: "+address+"age: "+age);
}
}

