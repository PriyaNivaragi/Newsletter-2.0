package com.ibm.newsletter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ibm.newsletter.dto.Recognition;

public interface RecognitionRepository extends JpaRepository<Recognition,Long> {
	
	List<Recognition> findAllRecognitionByIssueNumber(int issueNumber);

}
