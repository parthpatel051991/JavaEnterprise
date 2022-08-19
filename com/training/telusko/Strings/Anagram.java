package com.training.telusko.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;



public class Anagram extends SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n = "Grab";
		String n1 = "Brag";

		n = n.toLowerCase();
		n1 = n1.toLowerCase();

		System.out.println(n);
		System.out.println(n1);

		char[] a = new char[n.length()];
		char[] b = new char[n1.length()];

		if (n.length()!=n1.length()) {
			System.out.println("Strings are not Anagram");
		} else {
			a = n.toCharArray();
			b = n1.toCharArray();
			
			

			Arrays.sort(a);
			Arrays.sort(b);

			if (Arrays.equals(a, b)) {

				System.out.println("Strings Are Anagram.");

			} else {
				System.out.println("Strings are not Anagram");
			}

		}

	}

}
