package com.nttdata.java8features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Java8DateAndTime {
	
	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		LocalDate d=LocalDate.of(2017, 1, 13);
		d.getDayOfMonth();
		System.out.println(d);
		System.out.println(date);
		System.out.println(date.minusDays(1));
		
		LocalTime time=LocalTime.now();
		LocalTime t=LocalTime.of(15, 27, 56);
		System.out.println(t.plusHours(4));
		System.out.println(time);
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId  z=ZoneId.of("Europe/Paris");
		ZonedDateTime zz=ZonedDateTime.now(z);
		System.out.println(zz);
		
		// format the date 
		
		LocalDate l=LocalDate.now();
		
	String s=	l.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
	System.out.println(s);
	
	LocalDate first=LocalDate.parse("2007-05-10");
	LocalDate second=first.plus(Period.ofDays(5));
	
	int p=Period.between(d,date).getDays();
	long d1=ChronoUnit.DAYS.between(first,second);
	System.out.println(d1);
		
	}

}
