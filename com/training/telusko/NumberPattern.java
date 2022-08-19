package com.training.telusko;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// NUMBER PATTERN
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++) 
			{
			
				System.out.print(j+" ");
				
			}
			
			System.out.println();
		}
		
		
		System.out.println("==================================================================");
		
		// A,B,C,D  PATTERN
		
		for(int i=65;i<=71;i++) 
		{    
			for(int j=65;j<=i;j++) {
				char n = (char) j;
				System.out.print(n+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("==================================================================");
		
		// $ BOX PATTERN
		
		for(int i=1;i<=4;i++) {
			
			System.out.print("$ ");
		}
		System.out.println();
		

		for(int i=1;i<=2;i++) {
			System.out.print("$");
		    System.out.print("     ");
		    System.out.print("$");
		    System.out.println();
		}
		
		
        for(int i=1;i<=4;i++) {
			
			System.out.print("$ ");
		}
		
		

	}

}