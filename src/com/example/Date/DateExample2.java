package com.example.Date;

import java.util.Calendar;
import java.util.Date;

public class DateExample2 {
	
public static void main(String[] args) {
		
		Date endDateOfMonth = getEndDateFromMonthNumber(0, 2020);
		System.out.println("last date of a month from month no....." + endDateOfMonth);
		
	}
	 public static Date getEndDateFromMonthNumber(int month, int year)
	 {
		 Calendar calendar = Calendar.getInstance();
			
			calendar.set(year, month,1);
			int numOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			calendar.add(Calendar.DAY_OF_MONTH, numOfDaysInMonth-1);
			
			Date endDate = calendar.getTime();
			
		return endDate;
	 }

}
