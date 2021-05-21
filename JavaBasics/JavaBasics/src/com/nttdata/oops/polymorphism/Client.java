package com.nttdata.oops.polymorphism;

public class Client {
	
	public static void main(String[] args) {
		Area area=new Area();
		area.calArea(100, 200);
		float res1=area.calArea(10, 20.2f);
		int res2=area.calArea(10, 20, 30);
		System.out.println(" Ares of cuboid :"+res2);
		System.out.println("Area of Rect with float value"+res1);
		
		
		ChritmasGreet cgreet=new ChritmasGreet();
		cgreet.greeting();
		
	}

}
