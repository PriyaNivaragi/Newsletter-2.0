package com.ibm.newsletter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.newsletter.dto.Newsletter;
import com.ibm.newsletter.dto.Recognition;
import com.ibm.newsletter.repositories.RecognitionRepository;

@Service
public class RecognitionServiceImpl implements RecognitionService {
	
	@Autowired
	RecognitionRepository recognitionRepository;
	@Autowired
	NewsletterService newsletterService;

	@Override
	public List<Recognition> getRecognition() {
		
		Newsletter newsletterData = newsletterService.getNewsletterData();
		List<Recognition> recognition = recognitionRepository.findRecognitionByIssueNumber(newsletterData.getIssueNumber());
		// TODO Auto-generated method stub
		return recognition;
	}

	@Override
	public Recognition saveRecognition(Recognition recognition) {
		// TODO Auto-generated method stub
		return null;
	}

}
