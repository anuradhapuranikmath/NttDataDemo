package com.nttdata.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
	
		//Traditional way 
		Greet greet=new Greet();
		greet.greeting();
		greet.print();// Default method in functional interface can be called by concrete class which implements functional interface
		
		// lambda expression 
		
		Greeter greet1=()->{
			System.out.println(" Hello Welcome to Java 8 features ");
		};
		greet1.greeting();
		
		
		
		Greeter greet2=()->{
			System.out.println(" Hello new implementation ");
		};
		greet2.greeting();
	
		// lambda expression with parameters
		
		Addition add=(a,b)->{
			
			
			return(a+b);
		};
		
		int res=add.add(10, 20);
		System.out.println(" addition of two numbers is :"+res);
		
		Greeter.foo();// static method can be directly invoked by Interface Name in functional Interface
		
		
		//pre-defined functional interface called Predicate 
		
		Predicate<Integer> p=num->(num>10);
		boolean b=p.test(20);
		System.out.println(b);
		
		Predicate<String> p1=s->(s.length()>8);
		System.out.println(p1.test("Anuradha"));
		
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("hello"));
		
	}

}
