package com.training.telusko.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class RepetitiveChar extends StringMethods{

	// Objective : to find and print repetitive character from input string

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String n = scan.nextLine();

	//	n=n.toLowerCase();  optional if you want to ignore case3
		
		char a[] = n.toCharArray();
		

		Arrays.sort(a);
		trimArray(a);

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			int flag=0;
			for (int j = 1; j < a.length; j++) {

				if (a[i]==a[j]) {

					count++;

				}
				
			}
				if (count > 1) {
					
					System.out.println(a[i] + " repetition count : " + count);

				}
				
		}
		
	}

}
