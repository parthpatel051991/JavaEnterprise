package com.training.telusko.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

	// In this Program , we are going to check given that is given input example of
	// Pangram or not?

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the String to check : ");

		String n=scan.nextLine();

		n=n.toLowerCase();
		
	//	System.out.println(n);

		int count=0;

		char a[]=n.toCharArray();
		Arrays.sort(a);
		

		char temp[]=new char[n.length()];
		int j=0;

		for(int i=0;i<a.length-1;i++)
		{

			if(a[i]!=a[i+1]) {

				temp[j]=a[i];
				j++;	
			}
		}
		temp[j]=a[n.length()-1];
		
//		System.out.println(temp.length);

		for(int i=0;i<temp.length;i++) {


			if(97<=(int)temp[i] && (int)temp[i]<=122) {

				count++;
			}

		}

		
	//	System.out.println(count);
		
		
		if(count==26) {
			System.out.println("String is Pangram");
		}else
		{
			System.out.println("String is not Pangram");

		}


	}
}
