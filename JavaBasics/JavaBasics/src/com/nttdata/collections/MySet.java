package com.nttdata.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MySet {
	
	public static void main(String[] args) {
		
		/*TreeSet<Integer> set=new TreeSet<>();
		set.add(123);
		set.add(890);
		set.add(1);
		set.add(13);
		set.add(23);
		set.add(3);
		set.add(123);
		
		for(Integer i:set)
		{
			System.out.println(i);
		}*/
		
		
		TreeSet<Customer> set=new TreeSet<>();
		set.add(new Customer(101, "abc", "banglore"));
		set.add(new Customer(101, "abc", "banglore"));
		set.add(new Customer(156, "bnm", "hassan"));
		set.add(new Customer(11, "auio", "belgum"));
		set.add(new Customer(190, "aiop", "bnaglore"));
		
		for(Customer c:set)
		{
			System.out.println(c);
		}
		
	}

}
