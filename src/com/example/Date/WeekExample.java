package com.example.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WeekExample {
	public static void main(String[] args) {
		
		String date = "22-01-2020";
		
		System.out.println("week no is .......... "  + getWeekNoFromDate(date) );
		
	}
	
	 public static int getWeekNoFromDate(String dateinput)
	  {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		 Date date = null;
		 int week =0;
		try {
			date = format.parse(dateinput);
			 Calendar cal = Calendar.getInstance();
		     cal.setTime(date);
		      week = cal.get(Calendar.WEEK_OF_YEAR);

		     System.out.println("Input " + dateinput + " is in week " + week);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
	     
	     return week;
			
	}
	   

}
