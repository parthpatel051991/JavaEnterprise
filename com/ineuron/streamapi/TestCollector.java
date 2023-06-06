package com.ineuron.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestCollector {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(0);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		System.out.println(al);
		
		
		//till java 1.7v
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		for(Integer i1:al) {
			if(i1%2==0) {
				evenList.add(i1);
			}
		}
		System.out.println(evenList);
		System.out.println();
		
		
		//From JDK1.8V we use Streams
		//1. Configuration
		//2. Processing
		
		List<Integer> streamList = al.stream().filter(i -> i%2==0).collect(Collectors.toList());
		streamList.forEach(System.out ::println);
		System.out.println("===================================================================");
		
		
		//till java 1.7v
				ArrayList<Integer> doubleList = new ArrayList<Integer>();
				for(Integer i1:al) {
					 if(i1%2==0)
						doubleList.add(i1*2);
					
				}
				System.out.println(doubleList);
				System.out.println();
				
		//from JDK1.8V
		// map -> for every object , if a new object has to be created then go for map
				
				List<Integer> streamList2 = al.stream().filter(obj -> obj%2==0).map(obj -> obj*2).collect(Collectors.toList());
				streamList2.forEach(i -> System.out.println(i));
				streamList2.forEach(System.out :: println);
				
				
				
		
	}

}
