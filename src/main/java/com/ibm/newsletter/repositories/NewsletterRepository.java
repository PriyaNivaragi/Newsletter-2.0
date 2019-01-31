package com.ibm.newsletter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ibm.newsletter.dto.Newsletter;

@Repository
public interface NewsletterRepository extends JpaRepository<Newsletter, Long > {

	Newsletter findIssueNumberByMonthAndYear(int month, int year); //custom query
	
}
