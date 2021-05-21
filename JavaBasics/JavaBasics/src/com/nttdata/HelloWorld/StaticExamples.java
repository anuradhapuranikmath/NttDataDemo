package com.nttdata.HelloWorld;

public class StaticExamples {
	
	
	static int count;

	 
	
	 public StaticExamples() {
		count++;
		System.out.println(count);
	}
	 
	  void foo()
	 {
		  
	
		 System.out.println(" foo");
	 }
	
	
	public static void main(String[] args) {
		
		
		 System.out.println();
		 
		 
		StaticExamples st=new StaticExamples();
		StaticExamples st1=new StaticExamples();
		
		
		
		
	}

}
