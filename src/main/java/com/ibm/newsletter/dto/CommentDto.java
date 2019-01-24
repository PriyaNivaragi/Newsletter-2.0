package com.ibm.newsletter.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class CommentDto {
	
	private String comment;
	private boolean isReply;
	private int commentedBy_UID;
	private String commentPage;
	private String commentedBy_Name;
	
	private Date commentedDate;

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

	public int getCommentedBy_UID() {
		return commentedBy_UID;
	}

	public void setCommentedBy_UID(int commentedBy_UID) {
		this.commentedBy_UID = commentedBy_UID;
	}

	public String getCommentedBy_Name() {
		return commentedBy_Name;
	}

	public void setCommentedBy_Name(String commentedBy_Name) {
		this.commentedBy_Name = commentedBy_Name;
	}

	public Date getCommentedDate() {
		return commentedDate;
	}

	public void setCommentedDate(Date commentedDate) {
		this.commentedDate = commentedDate;
	}

	public String getCommentPage() {
		return commentPage;
	}

	public void setCommentPage(String commentPage) {
		this.commentPage = commentPage;
	}
	
	
	
	
	
	

}
