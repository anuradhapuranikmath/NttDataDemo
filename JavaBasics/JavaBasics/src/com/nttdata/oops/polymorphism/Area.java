package com.nttdata.oops.polymorphism;

public class Area {
	
	
	void calArea(int length,int breadth)
	{
		System.out.println("Area of Recatnagle is :"+length*breadth);
	}
	
	int calArea(int length,int breadth,int heigth)
	{
		return heigth*length*heigth;
		
	}
	
	float calArea(int length,float b)
	{
		return b*length;
		
	}

}
