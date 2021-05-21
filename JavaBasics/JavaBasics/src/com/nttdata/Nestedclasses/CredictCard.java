package com.nttdata.Nestedclasses;

public class CredictCard {
	
	private  int cardNo;
	private  int cardPin;
	
	
	public CredictCard(int cardNo, int cardPin) {
		super();
		this.cardNo = cardNo;
		this.cardPin = cardPin;
	}

	void doTransaction()
	{
		System.out.println(" transaction done !!!");
	}
	void print(){
	 class User
	{
		private String name;
		private String password;
		
		
		boolean validateCredictCardCredentails()
		{
			if(cardNo==123&&cardPin==345)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
	}
	 User user=new User();
	boolean b= user.validateCredictCardCredentails();
	if(b==true)
	{
		System.out.println(" your  login is successful");
		doTransaction();
	}
	else
	{
		System.out.println(" your credentials are invalid try again !!!credictCard.doTransaction();");
	}
	
	}

}
