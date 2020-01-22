package com.example.Date;

import java.util.Calendar;
import java.util.Date;

public class DateExample4 {
	
	public static void main(String[] args) {
		System.out.println("remove time from date ...... "  +  removeTime(new Date()));
		
	}
	
	public static Date removeTime(Date date) {
	     Calendar cal = Calendar.getInstance();
	     cal.setTime(date);
	     cal.set(Calendar.HOUR_OF_DAY, 0);
	     cal.set(Calendar.MINUTE, 0);
	     cal.set(Calendar.SECOND, 0);
	     cal.set(Calendar.MILLISECOND, 0);
	     return cal.getTime();
	 }

}
