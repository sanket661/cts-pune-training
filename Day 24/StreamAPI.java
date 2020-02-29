package com.ArrayQues;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String...args)
	{
		ArrayList<String> names=new ArrayList<>();
		addNames(names);
		System.out.print(names+ " ");
		
		//1. print name with length more than or equal to 6
		List<String> namesList = names.stream().filter(s -> s.length()>=6).collect(Collectors.toList());
		namesList.forEach(System.out::println);
		
		//2. names in upper case
		List<String> namesInUpper=names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		namesInUpper.forEach(System.out::println);
		
		//3.sort list
		List<String> defaultSorted=names.stream().sorted().collect(Collectors.toList());
		defaultSorted.forEach(System.out::println);
		
		//4. custom sorting in ascending order
		List<String> customSorted=names.stream().sorted((s1,s2)-> -s1.compareTo(s2)).sorted().collect(Collectors.toList());
		customSorted.forEach(System.out::println);
		
		long count = names.stream().count();
		System.out.println("List count is: "+count);
		
		Stream<Integer> data=Stream.of(1,11,111,1111,11111);
		System.out.println("Data count: "+data.count());
		
		Stream<String> lang=Stream.of("c","c++","Java","Python","Angular");
		List<String> length= lang.filter(s-> s.length()>4).collect(Collectors.toList());
		length.forEach(System.out::println);
		
		Stream<String> lang1=Stream.of("C","C++","Java","Python","Angular");
		List<String> abc=lang1.map(s->s.concat(" Programming")).collect(Collectors.toList());
		abc.forEach(System.out::println);
		
		
	}
	private static void addNames(ArrayList<String> names)
	{
		names.add("Sanket");
		names.add("Vijay");
		names.add("Manish");
		names.add("Sagar");
		names.add("Sanjay");
		names.add("Nimish");
		names.add("Abhishek");
	}
}
