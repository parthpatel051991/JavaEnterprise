package com.training.telusko;

import java.util.Scanner;

public class ThreeDimensionArray {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		
	int	[][][]a=new int [3][2][3];
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				
			for(int k=0;k<a[i][j].length;k++)	
			{
				System.out.println("Enter the Marks for Student "+k+" class of "+j+"School of "+i  );
				a[i][j][k]=s1.nextInt();
				
			}
		}
		}
		System.out.println("Marks of Student are as follows:" );
		
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) 
			{
				for(int k=0;k<a[i][j].length;k++) 
				{
					
					System.out.print(a[i][j][k]+ " ");
					
				}
			
				System.out.println();
			}
			
		}

	

}
}