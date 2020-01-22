package com.example.Date;

import java.util.Calendar;
import java.util.Date;

public class MonthExample1 {
	
	public static void main(String[] args) {
		
		System.out.println("get month no from date ...... "  +  getMonthNoFromDate(new Date()));
		
	}
	
	

public static int getMonthNoFromDate(Date date) 
{
	Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		
		return month;
	 
}
}