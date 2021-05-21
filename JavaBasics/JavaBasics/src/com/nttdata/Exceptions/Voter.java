package com.nttdata.Exceptions;

public class Voter {
	
	void validateVoterAge(int age) throws Exception 
	{
		if(age<18)
		{
			throw new Exception(" your not valid age for voting");
		}
		
		else
		{
			System.out.println(" your valid for voting age ");
		}
	}
public static void main(String[] args) {
	
	
	Voter vote=new Voter();
	
		try {
			vote.validateVoterAge(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
