package com.training.telusko.Strings;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* over here we are going to reverse the sentence word while
		   word positions preserved as well 
		*/
		
		// Think Twice -->  kniht eciwt
		
		String n = "Think Twice";
		String n1="";
		
	String	a[]=n.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=a[i].length()-1;j>=0;j--)
			{
				
				n1=n1+a[i].charAt(j);
	
			}
			n1 += " ";
		}
			
			System.out.println(n1);
			
		}
				
	}


