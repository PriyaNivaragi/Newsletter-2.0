package com.ibm.newsletter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.newsletter.dto.Newsletter;
import com.ibm.newsletter.service.NewsletterServiceImpl;

@RestController
public class NewsletterController {
	
	@Autowired
	NewsletterServiceImpl newsletterService;
	
	@GetMapping(path="/getNewsletterData")
	public List<Newsletter> getNewsletterData(){
		
		List<Newsletter> newsletterData;
		
		newsletterData= newsletterService.getNewsletterData();
		System.out.println(newsletterData.get(0).getIssueNumber());
		
		return newsletterData;
		
		
	}
	
	

}
