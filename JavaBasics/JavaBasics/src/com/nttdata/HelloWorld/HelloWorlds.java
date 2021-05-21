package com.nttdata.HelloWorld;

public class HelloWorlds {

	 /*multi line comment */
	
	
	public void foo(Integer ... a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	// member variable or instance varibale 
	public static void main(String ... args) {
		
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		
		HelloWorlds hello =new HelloWorlds();
		
	}
	
	

}
