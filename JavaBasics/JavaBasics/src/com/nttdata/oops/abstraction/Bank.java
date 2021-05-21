package com.nttdata.oops.abstraction;

public abstract class Bank  {
	
	String bankName;
	float loanInterest;
	
	
	public Bank(String bankName,float loanInterest) {
		super();
		this.bankName = bankName;
		this.loanInterest=loanInterest;
	}
	
	void greeting()
	{
		System.out.println(" welcome to all Customers ");
	}
	
	abstract void calCulateLoanInterest();
	

}
