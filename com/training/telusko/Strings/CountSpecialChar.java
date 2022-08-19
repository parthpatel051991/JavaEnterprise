package com.training.telusko.Strings;

import java.util.Scanner;

public class CountSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the String to find count of Special Characters :");
		
		String n = scan.nextLine();
		
		char a[]=n.toCharArray();
		
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int total =0;
		for(int i=0;i<a.length;i++)
		{
			if(33<=(int)a[i] && (int)a[i]<=47)
			{
				count++;
				
			}else if(58<=(int)a[i] && (int)a[i]<=64)
			{
				
				count1++;
				
			}
			else if(91<=(int)a[i] && (int)a[i]<=96)
			{
				count2++;
				
				
			}else if(123<=(int)a[i] && (int)a[i]<=126)
			{
				
				count3++;
				
			}else if(145<=(int)a[i] && (int)a[i]<=149)
			{
				
				count4++;
				
			}else if((int)a[i]==152)
			{
				
				count5++;
				
			}		
		}
		total= count + count1 + count2 + count3 +count4 + count5 ;
		System.out.println("Total no of special character found : "+total );
	}

}
