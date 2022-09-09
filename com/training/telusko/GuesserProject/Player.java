package com.training.telusko.GuesserProject;

import java.util.Scanner;

public class Player

{

	int guessFromPlayer;

	public int playing()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Your Guess within range of (1 to 5) :");

		guessFromPlayer=scan.nextInt();
		
		while(guessFromPlayer<1 || guessFromPlayer>5)
		{
			System.out.println("******************************ERROR*********************************");
			System.out.println("Please enter the vaild input. Your Input should between 1 to 5");
			System.out.println("====================================================================");
			System.out.println("Enter Your Guess within range of (1 to 5) :");

			guessFromPlayer=scan.nextInt();
		}

		return guessFromPlayer;
	}
	
	
	
}
	