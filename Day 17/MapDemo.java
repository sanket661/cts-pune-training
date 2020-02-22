package com.sanket;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String args[])
	{
		HashMap<String, Integer> map=new HashMap<>();
		map.put("Banana", 35);
		map.put("Orange", 60);
		map.put("Mango", 70);
		map.put("Grapes",100);
		map.put("Water Melon", 80);
		map.put("Banana", 70);
		//System.out.println(map.get("Grapes"));
		System.out.println(map.remove("Banana",35));
	    for(Entry<String, Integer> entry : map.entrySet())
	    {
	    	System.out.println(entry.getKey()+"---->"+entry.getValue());
	    }
	
	
	}
}
