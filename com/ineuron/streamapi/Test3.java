package com.ineuron.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("sachin");
		names.add("dravid");
		names.add("saurav");
		names.add("dhoni");
		
		
		//till java 1.7 
		
		ArrayList<String> upperCaseNames = new ArrayList<String>();
		for(String name : names) {
			upperCaseNames.add(name.toUpperCase());
		}
		
		System.out.println(upperCaseNames);
		System.out.println();
		
		
		// from jdk 1.8v using this
		List<String> streamList = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(streamList);
		System.out.println();
		
		streamList.forEach(name -> System.out.println(name));
		System.out.println();
		
		streamList.forEach(System.out::println);
	}

}
