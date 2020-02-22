package com.sanket;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Hashtabledemo {
public static void main(String args[]) {
	Hashtable<String, Integer> map=new Hashtable<>();
	map.put("Banana", 35);
	map.put("Orange", 60);
	map.put("Mango", 70);
	map.put("Grapes",100);
	map.put("Water Melon", 80);
	map.put("Banana", 70);
	//map.put("Water", null);
	System.out.println(map);
	for(Entry<String, Integer> entry : map.entrySet())
    {
    	System.out.println(entry.getKey()+"---->"+entry.getValue());
    }
	
	
	
	
	
	
}
}
