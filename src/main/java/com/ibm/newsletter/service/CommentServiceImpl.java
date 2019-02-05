package com.ibm.newsletter.service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.newsletter.dto.Comments;

import com.ibm.newsletter.repositories.CommentRepository;
import com.ibm.newsletter.util.NewsletterUtil;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	CommentRepository commentRepository;
	
	@Autowired
	NewsletterUtil util;
	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public List<Comments> getComments() {


		Query FindAllCommentsByIssueNumberandModuleId = entityManager.createNamedQuery("findCommentsByIssueNumber", Comments.class);
		FindAllCommentsByIssueNumberandModuleId.setParameter("month", util.getCurrentMonth());
		FindAllCommentsByIssueNumberandModuleId.setParameter("year", util.getCurrentYear());
		FindAllCommentsByIssueNumberandModuleId.setParameter("moduleName", "kyc");
		
	
		List<Comments> comments= FindAllCommentsByIssueNumberandModuleId.getResultList();
		
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
	
	public  List<Comments> getCommentsByIssueNumberAndModuleId(){
		
		
		
		return null;
		
		
	}
	 private static void printResult(Object result) {
		    if (result == null) {
		      System.out.print("NULL");
		    } else if (result instanceof Object[]) {
		      Object[] row = (Object[]) result;
		      System.out.print("[");
		      for (int i = 0; i < row.length; i++) {
		        printResult(row[i]);
		      }
		      System.out.print("]");
		    } else if (result instanceof Long || result instanceof Double
		        || result instanceof String) {
		      System.out.print(result.getClass().getName() + ": " + result);
		    } else {
		      System.out.print(result);
		    }
		    System.out.println();
		  }


}
