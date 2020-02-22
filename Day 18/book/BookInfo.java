package com.sanket.book;

import java.util.*;
import java.io.*;
public class BookInfo {
	static ArrayList<Book> books = null;

	static {
		books= new ArrayList<>();
		Book b1 = new Book(101, 500, "Maths and Statistics", "Sanket M");
		Book b2 = new Book(102, 500, "Science", "Sanket M");
		Book b3 = new Book(103, 500, "Interstellar", "Sanket M");
		Book b4 = new Book(104, 500, "Inception", "Sanket M");
		books.add(b1);
		books.add(b2);
	    books.add(b3);
		books.add(b4);
	}
}
