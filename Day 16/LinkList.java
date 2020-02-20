package com.sanket;

import java.util.LinkedList;

public class LinkList {
  public static void main(String args[])
  {
	  LinkedList<String> list=new LinkedList<>();
	//List list=new ArrayList();
	   list.add("hello");
	   list.add("To");
	   list.add("java");
	   list.add("batch");
	   list.add("007");
	   list.add("true");
	   list.addFirst("Start");
	   list.addLast("End");
	   System.out.println(list);
  }
}
