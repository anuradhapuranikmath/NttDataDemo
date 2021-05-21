package com.nttdata.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyList {
	
	
	public static void main(String[] args) {
		
		/*LinkedList<String> list=new LinkedList<String>();
		
		System.out.println("Before adding elements: "+list.size());
		
		list.add("hello");
		list.add("god");
		list.add("morning");
		list.add("hi");
		list.add("hello");
		list.add(null);
		list.add(2,"hi");
		
		
		System.out.println("After adding elemenst :"+list.size());
		
		
	
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		
		LinkedList<Customer> list=new LinkedList<Customer>();
		list.add(new Customer(101, "abc", "bnaglore"));
		list.add(new Customer(134, "xyz", "mysore"));
		list.add(new Customer(156, "bnm", "hassan"));
		list.add(new Customer(11, "auio", "belgum"));
		list.add(new Customer(190, "aiop", "bnaglore"));
		
		
		
		
		
		
		Collections.sort(list);
		
		
		
		
		System.out.println(" forward direction");
		ListIterator<Customer> ltr=list.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
	    System.out.println("--------------------------------------------------------------");	
		System.out.println(" backward direction");
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
	}

}
