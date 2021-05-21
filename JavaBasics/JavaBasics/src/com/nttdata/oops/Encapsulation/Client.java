package com.nttdata.oops.Encapsulation;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println(" Enter student ID");
		int id=scanner.nextInt();
		
		System.out.println(" Enter student name");
		String name=scanner.next();
		
		System.out.println("Enter student address");
		String address=scanner.next();
		
		Student student=new Student(id,name,address); 
		// registartion 
		System.out.println(student.toString());
		
	     student.setAddress("mysore ");	// updating 
	     System.out.println(student);

	}

}
