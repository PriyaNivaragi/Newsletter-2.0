package com.ibm.newsletter.service;

import java.util.List;

import com.ibm.newsletter.dto.Comments;
import com.ibm.newsletter.dto.Recognition;

public interface RecognitionService {

	List<Recognition> getRecognition();

	void addRecognition(Recognition recognition);

	void updateRecognition(long id, Recognition recognition);

	void deleteRecognition(long id);
	
	
	}
