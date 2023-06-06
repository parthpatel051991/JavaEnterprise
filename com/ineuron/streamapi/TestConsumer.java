package com.ineuron.streamapi;

import java.util.ArrayList;
import java.util.function.Consumer;

class MyConsumer implements Consumer<String>{

	@Override
	public void accept(String name) {
		System.out.println("accept method called");
		System.out.println(name);
		
	}
	
}


public class TestConsumer {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sachin");
		names.add("Dravid");
		names.add("Saurav");
		names.add("Dhoni");
		
		//Traditional approach
		Consumer<String> consumer = new MyConsumer();
		names.forEach(consumer);
		System.out.println();
		
		//lambda expression
		names.forEach(name ->System.out.println(name));
		System.out.println();
		
		// method reference
		names.forEach(System.out::println);
		
		
	}

}
