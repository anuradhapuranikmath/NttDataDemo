package com.nttdata.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyMap {
	
	public static void main(String[] args) {
		
		
		Hashtable<String, Integer> map=new Hashtable<>();
		map.put("Karnataka",555);
		map.put("Karnataka", 990);
		map.put("Kerala", 789);
		map.put("Tamilnadu", 1000);
		map.put("Bihar", 12300);
		map.put("Goa", 87);
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println("States are: "+m.getKey() +" \t"+" Active Covid cases are :"+m.getValue());
		}
		
		
		/*Scanner scanner =new Scanner(System.in);
		System.out.println(" Enter the state name to know the active cases of covid ");
		String state=scanner.next();
		
		int key =map.get(state);
		System.out.println(" Active cases in: "+state+" "+key);*/
		
	}

}
