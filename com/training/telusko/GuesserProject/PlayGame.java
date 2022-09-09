package com.training.telusko.GuesserProject;

public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Guesser Game:");
		
		System.out.println("You are playing against Jarvis. Try to match your number with number guessed by Jarvis.");
		System.out.println("=====================================================================");
		
		Umpire u = new Umpire();
		
		u.collectNum_Guesser();
		u.collectNum_Players();
		u.compare();
		
		
		
	}

}
