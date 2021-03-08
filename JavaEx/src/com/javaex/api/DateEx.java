package com.javaex.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
//		dataClassEx();
		calendarEx();
	}
	
	private static void calendarEx()
	{
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
	
		System.out.printf("현재: %d년 %d월 %d일%n", 
				now.get(Calendar.YEAR),
				now.get(Calendar.MONTH) + 1,
				now.get(Calendar.DATE));
		
		custom.set(2012, 8, 24);
		System.out.printf("custom: %d년 %d월 %d일%n", 
				custom.get(Calendar.YEAR),
				custom.get(Calendar.MONTH) + 1,
				custom.get(Calendar.DATE));
		
		Calendar future = Calendar.getInstance();
		future.add(Calendar.DATE, 100);
		
		System.out.printf("미래: %d년 %d월 %d일%n", 
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH) + 1,
				future.get(Calendar.DATE));
		
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일: " + dow);
		
		String dowStr;
		
		switch (dow) {
		case Calendar.MONDAY:
			dowStr = "월요일";
			break;
		case  Calendar.TUESDAY:
			dowStr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowStr = "목요일";
			break;
		case Calendar.FRIDAY:
			dowStr = "금요일";
			break;
		case Calendar.SATURDAY:
			dowStr = "토요일";
			break;
		case Calendar.SUNDAY:
			dowStr = "일요일";
			break;
		default:
			dowStr = "?";
			break;
		}
		
		System.out.println(dowStr);
	}

	private static void dataClassEx() {
		Date now = new Date();
		System.out.println("현재: " + now.toString());
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Full: " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Long: " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM: " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Short: " + df.format(now));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일");
		System.out.println(sdf.format(now));
	}
}
