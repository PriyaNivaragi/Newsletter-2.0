package com.ibm.newsletter.service;

import java.util.List;

import com.ibm.newsletter.dto.CommentDto;


public interface CommentService {
	
	List<CommentDto> getComments();
	CommentDto saveComment();
	void deleteComment();
	
	
	

}
