package com.ibm.newsletter.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ibm.newsletter.dto.Newsletter;

public interface NewsletterRepository extends CrudRepository<Newsletter, Long > {

}
