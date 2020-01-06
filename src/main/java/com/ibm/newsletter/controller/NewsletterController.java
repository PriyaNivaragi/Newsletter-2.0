package com.ibm.newsletter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.newsletter.entity.Newsletter;
import com.ibm.newsletter.service.NewsletterService;

@RestController
public class NewsletterController {
	
	@Autowired
	NewsletterService newsletterService;
	
	@GetMapping(path="/newsletter")
	public Newsletter getNewsletter(){

		Newsletter newsletter = new Newsletter();
		newsletter.setIssueNumber(222);
		
		//newsletterData = newsletterService.getNewsletterData();

		return newsletter;
		
		
	}
	
	

}
