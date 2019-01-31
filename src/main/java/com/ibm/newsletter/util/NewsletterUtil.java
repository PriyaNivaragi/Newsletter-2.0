package com.ibm.newsletter.util;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class NewsletterUtil {
	
	LocalDate currentDate=LocalDate.now();
	
	
	public int getCurrentMonth() {
		
		int currentMonth=currentDate.getMonthValue();
		int issueMonth=0;
		if(currentMonth==1) {
			issueMonth=12;
		}
		else {
			issueMonth=currentMonth-1;
		}
		return issueMonth;
		
	}
	
	public int getCurrentYear() {
		
		int currentMonth=currentDate.getMonthValue();
		int year= currentDate.getYear();
		
		if(currentMonth==1) {
			year= year-1;
			
		}
		return year;
	}

}
