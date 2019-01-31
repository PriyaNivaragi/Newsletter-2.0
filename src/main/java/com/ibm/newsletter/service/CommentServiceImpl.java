package com.ibm.newsletter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.newsletter.dto.Comments;
import com.ibm.newsletter.dto.Newsletter;
import com.ibm.newsletter.repositories.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	CommentRepository commentRepository;
	@Autowired
	NewsletterServiceImpl newsletterService;
	
	

	@Override
	public List<Comments> getComments() {
		
		Newsletter newsletterData=newsletterService.getNewsletterData();
		List<Comments> comments= commentRepository.findCommentsByIssueNumber(newsletterData.getIssueNumber());
		
		// TODO Auto-generated method stub
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
