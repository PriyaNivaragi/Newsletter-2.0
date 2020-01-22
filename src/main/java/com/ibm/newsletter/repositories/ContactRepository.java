package com.ibm.newsletter.repositories;

import com.ibm.newsletter.entity.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository <ContactUs, Long> {

    List<ContactUs> findAllContactUsList();
}
