package com.nttdata.Nestedclasses;

public class Outer {
	
	
	private int a;
	
	void print()
	{
		class Inner{
			
			void foo()
			{
				System.out.println(" local method inner class"+a);
			}
			
		}
		
		Inner in=new Inner();
		in.foo();
	}
public static void main(String[] args) {
	Outer out=new Outer();
	out.print();
}
}
