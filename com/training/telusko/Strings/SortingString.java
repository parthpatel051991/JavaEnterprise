package com.training.telusko.Strings;

public class SortingString {

	
	public static void bubbleSort(char[]a) {
		
		int n=a.length;
		char temp;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				
				if(a[j]>a[j+1])
				{
					
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
				
			}
}
}
}