package com.example.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MonthExample {
	
	public static void main(String[] args) {
		System.out.println("get month no from date ....... "   +  getMonthNoFromDate("22-02-2020"));
		
	}
	
	 public static int getMonthNoFromDate(String dateInString) {
		 

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		int month = 0;
		try {
			date = formatter.parse(dateInString);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			 month = cal.get(Calendar.MONTH);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return month;
		 
	 }

}
