package com.example.Date;

import java.util.Calendar;
import java.util.Date;

public class WeekExample3 {
	public static void main(String[] args) {
		
		Date date = getEndDateOfWeekFromWeekNo(4, 2020);
		System.out.println("end of a week from week no ............ "  +  date);
		
	}
	
	 public static Date getEndDateOfWeekFromWeekNo(int weekNo,int enterYear)
	 {
		 Calendar calendar = Calendar.getInstance();
		    calendar.clear();
		    calendar.set(Calendar.WEEK_OF_YEAR, weekNo);
		    calendar.set(Calendar.YEAR, enterYear);
		    calendar.add(Calendar.DATE, 6);
	        Date endDateOfWeek = calendar.getTime();

    
		return endDateOfWeek;
		 
	 }

}
