package com.ibm.newsletter.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ibm.newsletter.entity.Comments;
import com.ibm.newsletter.repositories.CommentRepository;
import com.ibm.newsletter.util.NewsletterUtil;

@Service


public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentRepository commentRepository;

	@Autowired
	NewsletterUtil util;
	

	@Override
	public List<Comments> getComments() {
		


		List<Comments> comments= commentRepository.findCommentsByIssueNumberAndModuleId(util.getIssueNumber(), 1);


		return comments;
	}

	@Override
	public Comments saveComment(Comments comment) {

		 commentRepository.save(comment);
		// TODO Auto-generated method stub
		return comment;
	}

	@Override
	public void deleteComment(long commentId) {

		commentRepository.deleteById(commentId);

	}




}
