package com.nttdata.HelloWorld;

public class Bottle {
	
	String bootleName; // memeber varibales or instance varibales 
	String color;
	int capacity;
	float price;
	String typeOfBottle;   //state
	
	void intiliazeBottle(String name,String color,int capacity,float price,String typeOfBottle)
	{
		bootleName=name;
		this.color=color;
		this.capacity=capacity;
		this.price=price;
       	this.typeOfBottle=typeOfBottle;
	}
	
	void printDetailsOfBottle()
	{
		System.out.println("Name of bottle is :"+ bootleName+ " \t "+" Color is: "+color
				+" Capacity is :"+capacity+ " \t "+ "Price is :"+price+ " \t"+"Type of bootle is :"+
					typeOfBottle
					
					
					);
	}
	
	void drinkingBottle()  // behaviour  member method
	{
		System.out.println(" Bottle is used for drinking ");
	} 
	
	public static void main(String[] args) {
		
		Bottle bottle=new Bottle();// object creation 
		
		bottle.intiliazeBottle("ABC", "blue", 2,200f, "plastic");
		
		
		bottle.printDetailsOfBottle();
		
		bottle.drinkingBottle();
		
		
	}

}
