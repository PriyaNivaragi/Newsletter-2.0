/*package com.ibm.newsletter.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.ibm.newsletter.dto.Newsletter;
import com.ibm.newsletter.service.NewsletterService;
import com.ibm.newsletter.service.NewsletterServiceImpl;

@Component
public class NewsletterServiceCommandLineRunner implements ApplicationListener<ContextRefreshedEvent>  {

	NewsletterServiceImpl newsletterService;
	
	
	Newsletter newsletter= new Newsletter();
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		newsletter= newsletterService.getNewsletterData();
		
	}

}
*/