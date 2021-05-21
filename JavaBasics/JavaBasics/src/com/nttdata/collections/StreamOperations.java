package com.nttdata.collections;

import java.util.ArrayList;
import java.util.List;

public class StreamOperations {
	
	public static void main(String[] args) {
		
		List<String> members=new ArrayList<>();
		members.add("Anu");
		members.add("Tanu");
		members.add("Manu");
		members.add("Shanu");
		members.add("Priya");
		members.add("Pooja");
		members.add("Preeti");
		members.add("Sonu");
		members.add("Rina");
		
		//filter operation
		
		members.stream().filter((s)->s.startsWith("S")).forEach(s->System.out.println(s));
		System.out.println("--------------------------------------");
		//map opeartions
		
		members.stream().map(String::toLowerCase).forEach(System.out::println);
		//reduce operation
		String res=members.stream().reduce("Hello",(a,b)->a+b);
		System.out.println("================================================");
		System.out.println(res);
		
	}

}
