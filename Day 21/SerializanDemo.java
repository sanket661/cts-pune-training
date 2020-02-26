
import java.io.*;

public class SerializanDemo {

	public static void serialize(Employee employee, String path)  throws Exception
	{
		FileOutputStream fout= new FileOutputStream(path);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		ObjectOutputStream oos=new ObjectOutputStream(bout);
		oos.writeObject(employee);
		oos.close();
		bout.close();
		fout.close();
	}
	
	public static Object deserialize(String filepath) throws Exception
	{
		FileInputStream fin= new FileInputStream(filepath);
		BufferedInputStream bin=new BufferedInputStream(fin);
		ObjectInputStream oin=new ObjectInputStream(bin);
		Object obj=oin.readObject();
		oin.close();
		return obj;
		
	}
	
	
	public static void main(String...args) throws Exception
	{
//		Employee employee=new Employee(201,"Sagar","UP","S.E.",24,30000,123456);
//		serialize(employee,"employee.txt");
//		System.out.println("Object saved successfully");
		
		Employee employee=(Employee)deserialize("employee.txt");
		System.out.println(employee);
		
		
	}	
}
