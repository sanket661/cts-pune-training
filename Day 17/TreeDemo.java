package com.sanket;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeDemo {
	public static void main(String args[]) {
		TreeMap<String, String> map=new TreeMap<>();
		map.put("Banana","a");
		map.put("Orange", "b");
		map.put("Mango", "c");
		map.put("Grapes","d");
		map.put("Water Melon", "e");
		map.put("Banana","f");
		//map.put("Water", null);
		System.out.println(map);
		for(Entry<String,String> entry : map.entrySet())
	    {
	    	System.out.println(entry.getKey()+"---->"+entry.getValue());
	    }
		
		
		
		
		
		
	}
}
