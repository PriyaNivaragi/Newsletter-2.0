package com.ibm.newsletter.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.newsletter.entity.Newsletter;
import com.ibm.newsletter.repositories.NewsletterRepository;
import com.ibm.newsletter.util.NewsletterUtil;

@Service
public class NewsletterServiceImpl implements NewsletterService {

    @Autowired
    NewsletterRepository newsletterRepository;

    @Autowired
    NewsletterUtil newsletterUtil;

    @Override
    public Newsletter getNewsletter() {

        Newsletter newsLetter = new Newsletter();
        int month = newsletterUtil.getCurrentMonth();
        int year = newsletterUtil.getCurrentYear();

        newsLetter = newsletterRepository.findIssueNumberByMonthAndYear(month, year);

        return newsLetter;
    }

    @Override
    public void saveNewsletter() {
        // TODO Auto-generated method stub


    }

    @Override
    public void updateNewsletter() {
        // TODO Auto-generated method stub

    }

}
