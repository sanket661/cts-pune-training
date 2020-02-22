package com.sanket;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;
public class WriteIntoMultipleFiles {

	public static void main(String[] args) throws Exception  {
		String path="C:\\Users\\seed\\Desktop\\sanket\\src\\com\\sanket\\ab.txt";
		String path1="C:\\Users\\seed\\Desktop\\sanket\\src\\com\\sanket\\cd.txt";
	    String path2="C:\\Users\\seed\\Desktop\\sanket\\src\\com\\sanket\\ef.txt";
		String path3="C:\\Users\\seed\\Desktop\\sanket\\src\\com\\sanket\\gh.txt";
	    /*FileOutputStream out1=new FileOutputStream(path);
		FileOutputStream out2=new FileOutputStream(path1);
		FileOutputStream out3=new FileOutputStream(path2);
		FileOutputStream out4=new FileOutputStream(path3);
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		String data="This is a common data to be written in the files";
		byte[] b=data.getBytes();
		bout.write(b);
		bout.writeTo(out1);
		bout.writeTo(out2);
		bout.writeTo(out3);
		bout.writeTo(out4);       */
		
		FileInputStream fin1=new FileInputStream(path);
		FileInputStream fin2=new FileInputStream(path1);
		FileInputStream fin3=new FileInputStream(path2);
		FileInputStream fin4=new FileInputStream(path3);
		
		Vector vector=new Vector();
		vector.add(fin1);
		vector.add(fin2);
		vector.add(fin3);
		vector.add(fin4);
		
		Enumeration en=vector.elements();
		
		SequenceInputStream sis=new SequenceInputStream(en);
		int i;
		while((i= sis.read()) != -1)
		{
			System.out.println((char)i);	
		}
		
	}
}
