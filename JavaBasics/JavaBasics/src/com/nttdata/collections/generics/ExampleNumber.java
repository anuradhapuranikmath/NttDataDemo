package com.nttdata.collections.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleNumber {
	
	public static void addNumbers(List< ? super Integer> list)
	{
		for(Object o:list)
		{
			System.out.println(o);
		}
	}
public static void main(String[] args) {
	
	
	List<Integer> list=new ArrayList<>();
	
	list.add(10);
	list.add(10);
	list.add(89);
	list.add(1);
	list.add(0);
	System.out.println(" values as list Integer are ");
	
	addNumbers(list);

	
	List<Number> list1=Arrays.asList(1,2,3,4);
	System.out.println(" values as list  Numbers are ");
	
	addNumbers(list1);
	
}
}
