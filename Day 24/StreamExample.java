package com.ArrayQues;
import java.util.ArrayList;

public class StreamExample {
 public static void main(String...args)
 {
	 ArrayList<Integer> list=new ArrayList<>();
	 list.add(20);
	 list.add(40);
	 list.add(35);
	 list.add(80);
	 list.add(62);
	 System.out.println("Numbera divisible by 2 and 5 are: ");
	 for(Integer i: list)
	 {
		 if(i%2==0 && i%5==0)
		 {
			 System.out.println(i);
		 }
	 }
	 System.out.println("Double the each no in list ");
	 for(Integer i: list)
	 {
		 System.out.print(i*2+" ");
	 }
 }
}
