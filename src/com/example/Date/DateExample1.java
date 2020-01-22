package com.example.Date;

import java.util.Calendar;
import java.util.Date;

public class DateExample1 {
	
	public static void main(String[] args) {
		
		Date firstDateOfMonth = getFirstDateFromMonthNumber(0, 2020);
		System.out.println("get first date of a month from month no....." + firstDateOfMonth);
		
	}
	 public static Date getFirstDateFromMonthNumber(int month, int year)
	 {
		 Calendar calendar = Calendar.getInstance();
		 calendar.set(year, month, 1);
		Date startDate = calendar.getTime();
		return startDate;
		 
	 }
}
