package com.nttdata.oops.abstraction;

public class Customer extends Bank{
	
	int customerId;
	String customerName;
	float balance;
	


	public Customer(String bankName, float loanInterest,int customerId,String customerName,float balance) {
		super(bankName, loanInterest);
		this.balance=balance;
		this.customerId=customerId;
		this.balance=balance;
		
	}


	@Override
	void calCulateLoanInterest() {
		
		System.out.println(" loan interset is "+balance*loanInterest/20);
	}
	
	void loginCredetials()
	{
		System.out.println(" login done here ");;
	}
	

}
