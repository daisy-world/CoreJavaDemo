package com.example.Date;

import java.util.Calendar;
import java.util.Date;

public class WeekExample1 {
	
	public static void main(String[] args) {
		
		System.out.println("get week no from date ....... "  + getWeekNoFromDate(new Date()) );
		
	}
	
	 public static int getWeekNoFromDate(Date dateinput) 
	   {
	 
	      Calendar cal = Calendar.getInstance();
	      cal.setTime(dateinput);
	      int week = cal.get(Calendar.WEEK_OF_YEAR);

	      System.out.println("Input " + dateinput + " is in week " + week);
	      
	      return week;
	 		
	 }

}
