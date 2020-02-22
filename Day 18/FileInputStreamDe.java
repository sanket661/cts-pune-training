package com.sanket;

import java.io.*;

public class FileInputStreamDe {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\seed\\Desktop\\sanket\\src\\com\\sanket\\data.txt";
		String path1="C:\\Users\\seed\\Desktop\\sanket\\src\\com\\sanket\\data1.txt";
		File file=new File(path);
		FileInputStream in=new FileInputStream(file);
		BufferedInputStream bin=new BufferedInputStream(in);
		System.out.println("File Name : "+file.getName());
		System.out.println("File length : "+file.length());
		System.out.println("Parent Name : "+file.getParent());
		System.out.println("File Name : "+file.listRoots());
		
	//	FileOutputStream out=new FileOutputStream(path1);
	//	BufferedOutputStream bout=new BufferedOutputStream(out);
		
		int i;
		while((i= in.read()) != -1)
		{
			System.out.print((char)i);	
		
		}
		
		
	}
}
