package com.example.Date;

import java.util.Date;

public class DateConversion {
	
	public static void main(String[] args) {
		
		System.out.println("inside main..");
		
		getISOFromDate(new Date());
		
		System.out.println("date in iso string .... "   + getISOFromDate(new Date())  );
		
	}
	
	public static String getISOFromDate(Date date){
		String dateString = null;
		if (null != date) {
			
			dateString = date.toInstant().toString();
			return dateString;
		}
		
		return dateString;
	}

}
