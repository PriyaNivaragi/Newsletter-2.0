package com.ibm.newsletter.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="NEWSLETTER_DATA")
@Entity
public class Data {
	
	
	private int moduleId;
	private int issueNumber;
	private String url;
	private String header;
	private String subHeader;
	private String description;
	private String currentStatus;
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public int getIssueNumber() {
		return issueNumber;
	}
	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getSubHeader() {
		return subHeader;
	}
	public void setSubHeader(String subHeader) {
		this.subHeader = subHeader;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	
	
	
	

}
