package com.nttdata.java8features;

@FunctionalInterface
public interface Greeter {
	
	void greeting();
	
	default void print()
	{
		System.out.println(" This is  a default method insid the functional Interface ");
	}
	
	static void foo()
	{
		System.out.println(" Static method inside the functional Inteface ");
	}

}
