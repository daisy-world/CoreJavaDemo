package com.example.Date;

import java.time.Instant;
import java.util.Date;

public class DateConversion1 {
	
public static void main(String[] args) {
		
		
		String IsoDate = "2020-01-22T10:26:00.996Z";
		
		getDateFromISOString(IsoDate);
		
		System.out.println("iso string to java date... "   + getDateFromISOString(IsoDate)  );
		
	}
	
	public static Date getDateFromISOString(String dateInISOString){
		Date date= null;
		if (null != dateInISOString &&  !dateInISOString.isEmpty() ) {
			 date = Date.from(Instant.parse( dateInISOString));
			return date;
		}
		return date;
	}

}
