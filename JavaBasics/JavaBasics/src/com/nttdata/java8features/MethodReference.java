package com.nttdata.java8features;

public class MethodReference {
	
	 void foo()
	{
		System.out.println(" non static  foo");
	}
	
	
	
	public static void main(String[] args) {
		
		/*Hello hello=MethodReference::foo; // method refernce 
*/		
		MethodReference m=new MethodReference();
		Hello hello=m::foo;
		
		
		hello.print();
		Hello.say();
		
		
	}

}
