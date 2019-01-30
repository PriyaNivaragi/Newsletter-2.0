package com.ibm.newsletter.dto;

import java.time.Month;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Newsletter {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name="ISSUENUMBER", nullable=false)
	private int issueNumber;
	
	@Column(name="MONTH", nullable=false)
	private int month;
	
	@Column(name="YEAR", nullable=false)
	private int year;
	
	@Column(name="TIMESTAMP", nullable=false)
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
	

	
}
