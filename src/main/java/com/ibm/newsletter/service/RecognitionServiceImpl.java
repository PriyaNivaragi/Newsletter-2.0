package com.ibm.newsletter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.newsletter.dto.Newsletter;
import com.ibm.newsletter.dto.Recognition;
import com.ibm.newsletter.repositories.RecognitionRepository;
import com.ibm.newsletter.util.NewsletterUtil;

@Service
public class RecognitionServiceImpl implements RecognitionService {

	@Autowired
	RecognitionRepository recognitionRepository;
	@Autowired
	NewsletterService newsletterService;
	@Autowired
	NewsletterUtil util;
	
	@Override
	public List<Recognition> getRecognition() {

		/* Newsletter newsletterData = newsletterService.getNewsletterData(); */
		List<Recognition> recognitionData = recognitionRepository.findAllRecognitionByIssueNumber(util.getIssueNumber());
		// TODO Auto-generated method stub
		return recognitionData;
	}
	@Override
	public void addRecognition(Recognition recognition) {
		 recognitionRepository.save(recognition);
		
		
	}
	@Override
	public void updateRecognition(long id, Recognition recognition) {
		recognition.setRecognitionId(id);
		recognitionRepository.save(recognition);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteRecognition(long id) {
		recognitionRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	}
	
