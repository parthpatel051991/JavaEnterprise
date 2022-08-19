package com.training.telusko.Strings;

import java.util.Scanner;

public class VowelsConsonants {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String to find count of Vowels and Consonants : ");

		String n =scan.nextLine();

		n=n.toLowerCase();

		char a[]=n.toCharArray();

		int count=0;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			switch((int)a[i]) 
			{

			case 97:
			case 101:
			case 105:
			case 111:
			case 117:
				count++;
				break;
			case 98:
			case 99:
			case 100:
			case 102:
			case 103:
			case 104:
			case 106:
			case 107:
			case 108:
			case 109:
			case 110:
			case 112:
			case 113:
			case 114:
			case 115:
			case 116:
			case 118:
			case 119:
			case 120:
			case 121:
			case 122:
				flag++;
				break;
			}

		}	
	
	System.out.println("Found Vowels :" + count);
	System.out.println("Found Consonants :"+ flag);
	}

}
				