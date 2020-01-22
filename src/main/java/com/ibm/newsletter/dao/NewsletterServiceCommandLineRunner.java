package com.ibm.newsletter.dao;


import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.ibm.newsletter.entity.Newsletter;
import com.ibm.newsletter.service.NewsletterService;


@Component
public class NewsletterServiceCommandLineRunner {
    @Autowired
    NewsletterService newsletterService;

    @Autowired
    private ServletContext servletContext;


    Newsletter newsletter = new Newsletter();

    @PostConstruct
    public void init() {
        newsletter = newsletterService.getNewsletter();
        servletContext.setAttribute("newsletter", newsletter);
    }
}
