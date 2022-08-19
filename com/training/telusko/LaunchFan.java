package com.training.telusko;


class Fan{
       String brand;
       int cost;
	
}



//  Own Array creation
public class LaunchFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Fan	[]f=new Fan[3];
		
	f[0]=new Fan();
	f[1]=new Fan();
	f[2]=new Fan();
	
	f[0].brand ="Bajaj";
	f[0].cost=2000;
	
	f[1].brand="Lumins";
	f[1].cost =3000;
	
	f[2].brand="Havells Smart Fan";
	f[2].cost=3500;
	
	System.out.println("Fans Catalouge :");
	for(int i=0;i<f.length;i++) {
		
		System.out.println((i+1)+"."  +f[i].brand);
		System.out.println("Cost in Rs :"+f[i].cost);
		System.out.println();
	}
		
	}

}
