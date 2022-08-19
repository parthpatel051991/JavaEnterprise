package com.training.telusko.Strings;

import java.util.Scanner;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your First Name :");
		String n1=scan.nextLine();
		
		System.out.println("Enter Your last Name :");
		String n2 = scan.nextLine();
		
		String n3 = n1 + " " +n2;
		
		System.out.println("Your Full Name is :" + n3 );
		
		
	}

}
