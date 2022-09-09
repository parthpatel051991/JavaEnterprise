package com.training.telusko.GuesserProject;

public class Umpire {

	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int count;
	int flag;
	int a,b;
	String m,n;
	
	public int collectNum_Guesser()
	{
		Guesser g =new Guesser();
		
		numFromGuesser=g.guessing();
		return numFromGuesser;
	}

	
	public void collectNum_Players()
	{
		
		Player p1 =new Player();
		Player p2 =new Player();
		Player p3 =new Player();
		
		System.out.println("Player 1");
		numFromPlayer1=p1.playing();
		
		System.out.println("Player 2");
		numFromPlayer2=p2.playing();
		
		System.out.println("Player 3");
		numFromPlayer3=p3.playing();
		
		
	}
	

	
	public void compare()
	{
	/*	System.out.println(numFromGuesser);
		System.out.println(numFromPlayer1);      Its for debugging purpose
		System.out.println(numFromPlayer2);
		System.out.println(numFromPlayer3);
	*/	
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromPlayer1==numFromPlayer2 && numFromPlayer1==numFromPlayer3)
			{
				System.out.println("Game is Tied . Play again.");
				count=1;
			}
			else if(numFromPlayer1==numFromPlayer2)
			{
				System.out.println("Player 1 and Player 2 are Won.");
				m="Player 1";
				n="Player 2";
				
				flag=1;
			}
			else if(numFromPlayer1==numFromPlayer3)
			{
				System.out.println("Player 1 and Player 3 are Won.");
				m="Player 1";
				n="Player3";
				
				flag=1;
			}
			else
			{
				System.out.println("Congretulations. Player 1 is Won.");

			}
		}else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromPlayer2==numFromPlayer3)
			{
				System.out.println("Player 2 and 3 are Won.");
				m="Player 2";
				n="Player 3";
				flag=1;
			}else
			{
				System.out.println("Congretulations. Player 2 is Won.");
			
			}
		}else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Congretulations. Player 3 is Won.");
		}else
		{
			System.out.println("Game Lost! SORRY try again.");
			count=1;
		}
		
		
		
		while(count==1)
		{
			System.out.println("==================LETS PLAY AGAIN===========================");
			Umpire u =new Umpire();
			u.collectNum_Guesser();
			u.collectNum_Players();
			u.compare();
		}
		
		while(flag==1)
		{
			System.out.println("====================Final Game==============================");
			System.out.println("Welcome to Final between "+m +" "+"and "+n );
			Umpire u =new Umpire();
			
			int x=u.collectNum_Guesser();
			
			Player p1=new Player();
			Player p2 =new Player();
			a=p1.playing();
			b=p2.playing();
		//	System.out.println(a);        its for debugging purpose
		//	System.out.println(b);
			
			if(x==a)
			{
				if(a==b)
				{
					System.out.println("Game is tied . play again.");
					flag=1;
				}
			
				else
				{
					System.out.println(m + " IS WON");
					flag=2;
				
				}
			}
			else if(x==b)
			{
				System.out.println(n+" is Won");
				flag=2;
			
			}
			else
			{
				System.out.println("Game lost. Play again");
				flag=1;
			}
		}
		
	}
	
}
