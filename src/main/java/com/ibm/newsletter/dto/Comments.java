package com.ibm.newsletter.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;




@Entity
@Table(name="NEWSLETTER_COMMENTS" )
@NamedQuery(name="findCommentsByIssueNumber", query = "SELECT c FROM Comments c JOIN Newsletter n ON n.issueNumber=c.issueNumber JOIN Module m ON c.moduleId=m.moduleId  WHERE  n.month=:month and n.year=:year and m.moduleName=:moduleName"
		
		)

public class Comments {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	
	@Column(name="COMMENT_ID")
	private int commentId;
	
	
	
	private int moduleId;
	
	
	private int issueNumber;
	
	private String comment;
	
	
	private boolean isReply;
	
	
	private int parentCommentId;
	
	
	private String commentedBy;
	
	
	private Date timeStamp;
	
/*	@ManyToOne
	@JoinColumn(name="moduleId", insertable = false, updatable = false)
	private Module module;
	
	@ManyToOne
	@JoinColumn(name="issueNumber", insertable = false, updatable = false)
	private Newsletter newsletter;*/
	

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

	

	public void setCommentedBy(String commentedBy) {
		this.commentedBy = commentedBy;
	}
	
	
	
	
	
	

}
