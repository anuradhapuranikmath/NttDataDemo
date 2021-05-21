package com.nttdata.Exceptions;

public class TestAssertion {

	
	void greeting(int num)
	{
		assert num>25:"its not chrtimas day";
		if(num==25)
		{
			System.out.println(" chrtimas is on "+num+ " december evry year");
		}
		
	}
	
	public static void main(String[] args) {
		
		TestAssertion test=new TestAssertion();
		test.greeting(10);
	}
}
