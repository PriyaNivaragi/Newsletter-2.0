package com.ibm.newsletter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.newsletter.dto.Newsletter;
import com.ibm.newsletter.repositories.NewsletterRepository;

@Service
public class NewsletterServiceImpl implements NewsletterService {
	
	@Autowired
	NewsletterRepository newsletterRepository;

	@Override
	public List<Newsletter> getNewsletterData() {
		
	List<Newsletter> newsLetterList= new ArrayList<>();
	
	newsletterRepository.findAll().forEach(e->newsLetterList.add(e));
	
		return newsLetterList;
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
