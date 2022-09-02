package com.training.telusko.PatternAssignment;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n=14;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==n-1 ||i==n-2 || j==0 && i>=(n-1)/2 || j==n-1 && i >= (n-1)/2 || i-j >= (n-1)/2 || i +j >= (n-1) +(n-1)/2)
				{
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}

			}
			System.out.println();

		}
	}

}
