package com.nttdata.oops.inheritence;

public class ContractEmployee extends Person{
	
	public ContractEmployee(String name, String address,int contractYears) {
		super(name, address);
	    this.contractYears=contractYears;
	}

	int contractYears;
	
	void printContractEmployeeDeatails()
	{
		System.out.println(name+" "+address+" "+contractYears);
	}

}
