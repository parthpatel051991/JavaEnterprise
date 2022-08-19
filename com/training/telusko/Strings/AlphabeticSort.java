package com.training.telusko.Strings;

import java.util.Scanner;

public class AlphabeticSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String to Sort Alphabetically: ");

		String n= scan.nextLine();

		n= n.toLowerCase();

		char []a=n.toCharArray();

		char temp;

		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(97<=(int)a[i] && (int)a[i]<=122) 
				{
					if((int)a[i] > (int)a[j]) 
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
		}

		for(int i=0;i<a.length;i++) 
		{
			if(97<=(int)a[i] && (int)a[i]<=122)
			{
				System.out.print(a[i]);
			}
		}

	}

}
