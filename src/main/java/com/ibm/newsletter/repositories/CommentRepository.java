package com.ibm.newsletter.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.newsletter.dto.Comments;

public interface CommentRepository extends JpaRepository<Comments, Long>{
/*	
	List<Comments> findCommentsByIssueNumberAndModuleId(int issueNumber,int ModuleId);*/
	
	
/*	List<Comments> fetchCommentsByIssueNumber(int month, int moduleId, int year);*/


}
