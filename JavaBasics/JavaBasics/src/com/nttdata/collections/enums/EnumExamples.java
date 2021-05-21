package com.nttdata.collections.enums;

import java.time.LocalDate;
import java.time.LocalTime;

public class EnumExamples {
	
	public enum Season{WINTER,SUMMER,SPRING}
	
	public static void main(String[] args) {
		
		for(Season s:Season.values())
		{
			System.out.println(s);
		}
	}

	
	
	
}
