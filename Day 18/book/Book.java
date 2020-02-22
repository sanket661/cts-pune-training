package com.sanket.book;


import java.io.*;
import java.util.*;


public class Book {
    static int bid;
	static int price;
    static String bname;
	static String aname;
    static ArrayList<Book> book=new ArrayList<>();
    public Book() { }
	public Book(int bid, int price, String bname, String aname) {
		super();
		this.bid = bid;
		this.price = price;
		this.bname = bname;
		this.aname = aname;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public static void addBook(Book book)
	{
		book.addBook(book);
	}
	
	public static void main(String args[]) throws Exception
	{ int ch;
		//Book b=new Book();
		String str=null;
	String path="C:\\Users\\seed\\Desktop\\sanket\\src\\com\\sanket\\xyzabc.txt";
	FileReader f1=new FileReader(path);
	FileWriter out=new FileWriter(path,true);
	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);
		do {
		System.out.println("Enter choise: ");
		System.out.println("1. Add book");
		System.out.println("2. Display book");
		System.out.println("3. Exit");
		ch=Integer.parseInt(br.readLine());
		switch(ch)
		{
		case 1: System.out.println("Enter book name: ");
		        bname=br.readLine();
		        System.out.println("Enter author name: ");
		        aname=br.readLine();
		        System.out.println("Enter book id: ");
		        bid= Integer.parseInt(br.readLine());
		        System.out.println("Enter book price: ");
		        price=Integer.parseInt(br.readLine());
		        //Book b1=new Book(bid, price, bname, aname);
		        //addBook(b1);
		        out.write(bid+"\t"+bname+"\t"+aname+"\t"+price+"\n");
		        
		        break;
		case 2: BufferedReader br1 = new BufferedReader(new FileReader(path));
		         while ((str = br1.readLine())!= null) { 
                    System.out.println(str);
                }
		        break;
		case 3: System.exit(0);
		break;
		default: System.out.println("Enter proper choise");
		   
		
		
		
		}
	}while(ch!=3);out.close();
	}	
}



