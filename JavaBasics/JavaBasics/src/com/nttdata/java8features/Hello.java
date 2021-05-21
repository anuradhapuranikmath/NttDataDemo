package com.nttdata.java8features;

public interface Hello {
	
	void print();
	static void say()
	{
		System.out.println(" static method from functional interface");
	}

}
