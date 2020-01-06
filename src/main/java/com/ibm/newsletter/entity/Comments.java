package com.ibm.newsletter.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="NEWSLETTER_COMMENTS" )
public class Comments {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private long commentId;
	
	
	
	private int moduleId;
	
	
	private int issueNumber;
	
	private String comment;
	
	
	private boolean isReply;
	
	
	private int parentCommentId;
	
	
	private String commentedBy;
	
	
	private Date timeStamp;
	

	

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public int getParentCommentId() {
		return parentCommentId;
	}

	public void setParentCommentId(int parentCommentId) {
		this.parentCommentId = parentCommentId;
	}

	public String getCommentedBy() {
		return commentedBy;
	}

	public void setCommentedByName(String commentedBy) {
		this.commentedBy = commentedBy;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isReply() {
		return isReply;
	}

	public void setReply(boolean isReply) {
		this.isReply = isReply;
	}

	
	
	

	public long getCommentId() {
		return commentId;
	}

	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	

	public void setCommentedBy(String commentedBy) {
		this.commentedBy = commentedBy;
	}
	
	
	
	
	
	

}
