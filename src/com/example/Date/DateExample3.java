package com.example.Date;

import java.util.Calendar;
import java.util.Date;

public class DateExample3 {
	
	public static void main(String[] args) {
		System.out.println("get year from a date ....... "  +  getYearFromDate(new Date()));
	}
	
	public static int getYearFromDate(Date date) {
		 Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		return year;
		 
		 
	 }

}
