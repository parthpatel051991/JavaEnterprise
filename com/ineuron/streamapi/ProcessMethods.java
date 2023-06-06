package com.ineuron.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ProcessMethods {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("sachin");
		names.add("saurav");
		names.add("dhoni");
		names.add("dravid");
		names.add("kohli");
		names.add("raina");
		

		
		System.out.println(names);
		
		//count
		List<String> result = names.stream().filter(name -> name.length()>5).collect(Collectors.toList());
		System.out.println(result.size());
		
		long count = names.stream().filter(name -> name.length()>5).count();
		System.out.println("The no of objects whose string length > 5 is ::"+ count);
		System.out.println("===============================================================");
		//Comparable (Predefined API for natural sorting order -> compareTo(Object obj)
		//Comparator (for user-defined class for cutomized sorting order)--> compare(Obj1,Obj2)
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println("Before sorting ::" +al);
		
		System.out.println("===============================================================");
		//using stream api 
		// in sorted Comparable is used ... Natural sorting order
		List<Integer> resultList = al.stream().sorted().collect(Collectors.toList());
		System.out.println("After sorting ::" + resultList);
		
		System.out.println("===============================================================");
		//reverse
		//in sorted Comparator is used
		
		List<Integer> customizedResult = al.stream().sorted((i1,i2) ->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Modified sorting reverse ::" + customizedResult);
		
		System.out.println("===============================================================");
		
		//Minimum
		Integer minimum = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum no is ::" + minimum);
	
		System.out.println("===============================================================");
		
		//Maximum
		Integer maximum = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Maximum no is ::"+maximum);
		
		System.out.println("===============================================================");
		
		//ToArray
		
		Object[] objArray = al.stream().toArray();
		for(Object obj:objArray) {
			System.out.println(obj);
		}
		System.out.println("===============================================================");
		
		Integer[] intArray = al.stream().toArray(Integer[]::new);
		for(Integer obj: intArray) {
			System.out.println(obj);
		}
		
		System.out.println("===============================================================");
		
		
		//Stream API ===> Collections(group of Objects)
		
		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		
		System.out.println("===============================================================");
		
		Double [] d = {10.0,10.1,10.2,10.3,10.4};
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(System.out::println);
	}

}
