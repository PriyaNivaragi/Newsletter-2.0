package com.ibm.newsletter.entity;


import java.util.Date;

import javax.persistence.*;


@Entity
@Table (name = "NEWSLETTER")
public class Newsletter {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ISSUE_NUMBER", nullable = false)
    private int issueNumber;

    @Column(name = "MONTH", nullable = false)
    private int month;

    @Column(name = "YEAR", nullable = false)
    private int year;

    @Column(name = "TIME_STAMP", nullable = false)
    private Date timeStamp;

    public int getIssueNumber() {
        return issueNumber;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

}
