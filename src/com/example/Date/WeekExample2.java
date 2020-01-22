package com.example.Date;

import java.util.Calendar;
import java.util.Date;

public class WeekExample2 {
	
	public static void main(String[] args) {
		
		Date date = getStartDateOfWeekFromWeekNo(4, 2020);
		
		System.out.println("start date of a week from week no ....... "   +  date);
		
	}
	
	 public static Date getStartDateOfWeekFromWeekNo(int weekNo,int enterYear)
	 {
		Calendar calendar = Calendar.getInstance();
	    calendar.clear();
	    calendar.set(Calendar.WEEK_OF_YEAR, weekNo);
	    calendar.set(Calendar.YEAR, enterYear);
	    Date startDateOfYear = calendar.getTime();
			
		return startDateOfYear;
		
	}
}
