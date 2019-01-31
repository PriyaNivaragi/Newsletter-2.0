package com.ibm.newsletter.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.newsletter.dto.Newsletter;
import com.ibm.newsletter.repositories.NewsletterRepository;
import com.ibm.newsletter.util.NewsletterUtil;

@Service
public class NewsletterServiceImpl implements NewsletterService {

	@Autowired
	NewsletterRepository newsletterRepository;
	
	@Autowired
	NewsletterUtil newsletterUtil;

	@Override
	public Newsletter getNewsletterData() {

		Newsletter newsLetterData= new Newsletter();
		int month=newsletterUtil.getCurrentMonth();
		int year=newsletterUtil.getCurrentYear();
		
		newsLetterData=	newsletterRepository.findIssueNumberByMonthAndYear(month, year);

		return newsLetterData;
	}

	@Override
	public void saveNewsletterData() {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void updateNewsletterData() {
		// TODO Auto-generated method stub

	}

}
