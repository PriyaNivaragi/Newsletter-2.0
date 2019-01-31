package com.ibm.newsletter.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="COMMENTS" ,schema="NEWSLETTER")
public class Comments {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	
	@Column(name="COMMENTID")
	private int commentId;
	
	@Column(name="MODULEID")
	private int ModuleId;
	
	@Column(name="ISSUENUMBER")
	private int issueNumber;
	
	private String comment;
	
	@Column(name="ISREPLY")
	private boolean isReply;
	
	@Column(name="PARENTCOMMENTID")
	private int parentCommentId;
	
	@Column(name="COMMENTEDBY")
	private String commentedBy;
	
	@Column(name="TIMESTAMP")
	private Date timeStamp;

	public int getModuleId() {
		return ModuleId;
	}

	public void setModuleId(int moduleId) {
		ModuleId = moduleId;
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

	
	
	

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}
	
	
	
	
	
	

}
