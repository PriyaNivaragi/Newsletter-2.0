package com.ibm.newsletter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.newsletter.dto.Recognition;

public interface RecognitionRepository extends JpaRepository<Recognition,Long> {
	
	List<Recognition> findRecognitionByIssueNumber(int issueNumber);

}
