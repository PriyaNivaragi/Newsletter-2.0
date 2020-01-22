package com.ibm.newsletter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.newsletter.entity.Recognition;
import org.springframework.stereotype.Repository;

@Repository
public interface RecognitionRepository extends JpaRepository<Recognition,Long> {
	
	List<Recognition> findAllRecognitionByIssueNumber(int issueNumber);

}
