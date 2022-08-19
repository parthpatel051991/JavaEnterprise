package com.training.telusko.Strings;

import java.util.Arrays;


public class StringMethods {


	public static char[] removeDuplicateElements(char a[]) {

		int n=a.length;

		char temp[]=new char[n];
		int j=0;
		
		Arrays.sort(a);

		for(int i=0;i<n-1;i++)       
		{

			if(a[i]!=a[i+1]) {       

				temp[j]=a[i];        
				j++;	            
			}
		}
		temp[j]=a[n-1];

		for(int i=0;i<a.length;i++) {

			a[i]=temp[i];
		}	


		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {

				count++;
			}
		}
		char b[]=new char[count];	

		for(int i=0;i<count;i++) {

			b[i]=a[i];	
		}


		return b;
	}

	public static int[] removeDuplicateElements(int a[]) {

		int n=a.length;

		int temp[]=new int[n];
		int j=0;

		Arrays.sort(a);

		for(int i=0;i<n-1;i++)
		{

			if(a[i]!=a[i+1]) {

				temp[j]=a[i];
				j++;	
			}
		}
		temp[j]=a[n-1];

		for(int i=0;i<temp.length;i++) {

			a[i]=temp[i];

		}

		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {

				count++;
			}
		}
		int b[]=new int[count];	

		for(int i=0;i<count;i++) {

			b[i]=a[i];	
		}


		return b;
	}


	public static int[] trimArray(int a[]) {

		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {

				count++;
			}
		}
		int b[]=new int[count];	

		for(int i=0;i<count;i++) {

			b[i]=a[i];	
		}


		return b;

	}
	
	public static char[] trimArray(char a[]) {

		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {

				count++;
			}
		}
		char b[]=new char[count];	

		for(int i=0;i<count;i++) {

			b[i]=a[i];	
		}


		return b;

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char b[]= {1,2,3,3,4,5,6,7,2,2,2};

		int x[]= {3,5,6,3,2,3,3,1,8,2,1};

		int y[]= {1,5,6,7,8,0,0,0};
		
		

		b=removeDuplicateElements(b);
		x=removeDuplicateElements(x);



		for(int i=0;i<b.length;i++)
		{
			System.out.print((int) b[i]+" ");
		}
		System.out.println();
		System.out.println("================================================================");

		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}

		System.out.println();
		System.out.println("===============================================================");

		y=trimArray(y);
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+" ");
		}

	}

}
