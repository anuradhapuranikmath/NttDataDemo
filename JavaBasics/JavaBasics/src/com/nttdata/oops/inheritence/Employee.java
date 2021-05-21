package com.nttdata.oops.inheritence;

public class Employee extends Person{
	
	double salary;

	public Employee(String name, String address,double salary) {
	
		super(name, address);
		this.salary=salary;
				
	}	
		void printEmployeeDetails()
		{
			System.out.println(name+" "+address+" "+salary);
		}
		
	

	
}
