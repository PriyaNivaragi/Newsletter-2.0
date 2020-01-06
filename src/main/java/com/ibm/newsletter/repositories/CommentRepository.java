package com.ibm.newsletter.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.newsletter.entity.Comments;

public interface CommentRepository extends JpaRepository<Comments, Long>{

	List<Comments> findCommentsByIssueNumberAndModuleId(int issueNumber,int ModuleId);
	



}
