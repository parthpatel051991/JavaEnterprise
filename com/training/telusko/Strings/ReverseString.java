package com.training.telusko.Strings;

import java.util.Scanner;

//import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Over here we can add scanner class to take any user string input 		
		//		Scanner scan=new Scanner(System.in);
		//		String n = scan.nextLine();
		//	System.out.println("Enter the String that you want to reverse: ");
		//  here we are going to Reverse iNeuron 

		

		String n = "iNeuron";



		String n1 = "";
		for (int i = n.length() - 1; i >= 0; i--) {

			n1 = n1 + n.charAt(i);

		}
		System.out.println(n1);

	}

}
