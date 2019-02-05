package com.ibm.newsletter.service;

import java.util.List;

import com.ibm.newsletter.dto.Comments;
import com.ibm.newsletter.dto.Recognition;

public interface RecognitionService {

	List<Recognition> getRecognition(); 
	Recognition saveRecognition(Recognition recognition);
	
	}
