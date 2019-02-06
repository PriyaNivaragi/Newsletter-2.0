package com.ibm.newsletter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.newsletter.dto.Newsletter;
import com.ibm.newsletter.service.NewsletterService;
import com.ibm.newsletter.service.NewsletterServiceImpl;

@RestController
public class NewsletterController {
	
	@Autowired
	NewsletterService newsletterService;
	
	@GetMapping(path="/getNewsletterData")
	public Newsletter getNewsletterData(){
		
		Newsletter newsletterData;
		
		newsletterData= newsletterService.getNewsletterData();
		
		
		return newsletterData;
		
		
	}
	
	

}
