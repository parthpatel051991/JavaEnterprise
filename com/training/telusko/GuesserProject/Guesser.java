package com.training.telusko.GuesserProject;

import java.util.Random;

public class Guesser 
{
	
	int guessNum;
	
	public int guessing()
	{
		Random r= new Random();
		guessNum=r.nextInt(5)+1;
		
	//	System.out.println(guessNum);     //  for debugging purpose
 		return guessNum;
	}
	
}
	
	
	
