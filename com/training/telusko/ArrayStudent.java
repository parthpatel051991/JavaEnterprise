package com.training.telusko;

import java.util.Scanner;

public class ArrayStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the total number of students :");
		int students = s1.nextInt();
		
		int[] a = new int[students];
		
		for(int i=0;i<a.length;i++) {
			Scanner s2=new Scanner(System.in);
			System.out.println("Enter the Marks for student "+(i+1)+":");
			a[i]=s2.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Marks of Student No "+(i+1)+ " is :"+a[i]);
		}
	}

}
