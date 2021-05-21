package com.nttdata.oops.inheritence;

import com.nttdata.oops.Encapsulation.EncapsulationExample;

public class Client  extends EncapsulationExample{

	public static void main(String[] args) {
	
	Employee employee=new Employee("Anu", "banglore", 20000);
		
     employee.printEmployeeDetails();
     employee.greeting();
     
     ContractEmployee conEmployee=new ContractEmployee("tanu", "belgum", 3);
     conEmployee.printContractEmployeeDeatails();
     conEmployee.greeting();
     
 	
 	
	}

}
