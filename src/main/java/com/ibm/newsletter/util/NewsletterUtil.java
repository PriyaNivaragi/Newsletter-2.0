package com.ibm.newsletter.util;

import java.time.LocalDate;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.newsletter.entity.Newsletter;

@Component
public class NewsletterUtil {

    LocalDate currentDate = LocalDate.now();
    @Autowired
    private ServletContext servletContext;


    public int getCurrentMonth() {

        int currentMonth = currentDate.getMonthValue();
        int issueMonth = 0;
        if (currentMonth == 1) {
            issueMonth = 12;
        } else {
            issueMonth = currentMonth - 1;
        }
        return issueMonth;

    }

    public int getCurrentYear() {

        int currentMonth = currentDate.getMonthValue();
        int year = currentDate.getYear();

        if (currentMonth == 1) {
            year = year - 1;

        }
        return year;
    }

    public int getIssueNumber() {

        Newsletter newsletter = (Newsletter) servletContext.getAttribute("newsletter");

        int issueNumber = newsletter.getIssueNumber();
        return issueNumber;
    }

}
