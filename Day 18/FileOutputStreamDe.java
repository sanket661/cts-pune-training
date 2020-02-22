package com.sanket;
import java.io.*;
public class FileOutputStreamDe {
	
	//FileNotFoundException, IOException
	public static void main(String[] args) throws Exception {
	String path="C:\\Users\\seed\\Desktop\\sanket\\src\\com\\sanket\\data.txt";
    FileOutputStream out=new FileOutputStream(path,true);
    
    String message="Hello";
    byte b[]=message.getBytes();
    out.write(b);
    out.close();
    
    
    
    
    
    
    
    
    
    
    
    
    
 }
}
