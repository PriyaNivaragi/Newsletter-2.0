package com.ibm.newsletter.service;

import java.util.List;

import com.ibm.newsletter.entity.Comments;


public interface CommentService {
	
	List<Comments> getComments();
	Comments saveComment(Comments comment);
	void deleteComment(long commentId);
	
	
	

}
