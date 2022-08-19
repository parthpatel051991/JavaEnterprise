package com.training.telusko;



public class Sorting {
	
	static  char[] bubbleSort(char[]a) {
		
		int n=a.length;
		char temp;
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++) {
				
				if(a[j-1]>a[j])
				{
					
					temp=a[j-1];
					a[j-1]=a[j];
					a[j-1]=temp;
				}
				
			}
				
		}
		return a;
		}
	
	
	
	public static void main(String[] args) {
		
		
		char a[]= {3,2,1};
		
	a=bubbleSort(a);
	
	for(int num:a) {
	System.out.print(num+ " ");
	}
	}
 	}
	
	



