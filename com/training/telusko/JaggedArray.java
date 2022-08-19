package com.training.telusko;

import java.util.Scanner;

public class JaggedArray {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner s1 = new Scanner(System.in);
			
		int	[][]a=new int [3][];
		
		a[0]=new int[2];
		a[1]=new int[3];
		a[2]=new int[2];
			
			for(int i=0;i<a.length;i++) 
			{
				for(int j=0;j<a[i].length;j++) 
				{
					System.out.println("Enter the Marks for Student "+j+" class of "+i+" :" );
					a[i][j]=s1.nextInt();
					
				}
			}
			System.out.println("Marks of Student are as follows:" );
			
			for(int i=0;i<a.length;i++) 
			{
				for(int j=0;j<a[i].length;j++) 
				{
					
					System.out.print(a[i][j]+" ");
					
				}
				System.out.println();
			}
			

		}

	}






















































