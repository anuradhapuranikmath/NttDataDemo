package com.nttdata.collections;

import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {
	
	public static void main(String[] args) {
		
	 ArrayList<Product> list=new ArrayList<>();
	 list.add(new Product(101,20.34,23,"Bread"));	
	 list.add(new Product(123,224.34,9,"Butter"));	
	 list.add(new Product(189,400.8,90,"Jam"));	
	 list.add(new Product(171,789.34,45,"Biscuit"));	
	 list.add(new Product(151,90,45,"Noodles"));	
	 list.add(new Product(231,2000.34,23,"Cashewnut"));	
	 
	 System.out.println(" sorting by Name ");
	 
	 Collections.sort(list, new SortByName());
	 
	 for(Product p:list)
	 {
		 System.out.println(p);
	 }
	 
System.out.println("----------------------------------------------------------------------------------------");	 
System.out.println(" sorting by Price ");
	 
	 Collections.sort(list, new SortByPrice());
	 
	 for(Product p:list)
	 {
		 System.out.println(p);
	 }
	 
	 //  get the list of prodcuts whose price is gretear than 90 rs traditional approcach 
	 
	 List<Double> pList=new ArrayList();
	 
	     for(Product p:list)
	     {
	    	 if(p.getProductPrice()>90)
	    	 {
	    		 pList.add(p.getProductPrice());
	    	 }
	     }
	 
	 System.out.println(pList);
	 
	 // slove with streams 
	 System.out.println(" out put with lambda");
	long c= list.stream().filter(p->p.getProductPrice()>90).count();
	System.out.println(c);
	 
	 
	
	}

}
