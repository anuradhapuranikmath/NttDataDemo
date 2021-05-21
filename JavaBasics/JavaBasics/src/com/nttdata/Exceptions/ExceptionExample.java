package com.nttdata.Exceptions;

import java.util.Scanner;

public class ExceptionExample {
	
	
	public static void main(String[] args) {
		
		Scanner scanner=null;
		System.out.println(" before exception");
		// try block use when any code you think might throw exception 
		try{
			
			scanner=new Scanner(System.in);
			
		int a=10/10;
		}
		
		
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println(" always excutes ");
			scanner.close();
		}
		
		 System.out.println(" after exception");
		 
		
	}

}
