package com.ibm.newsletter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.newsletter.entity.Comments;
import com.ibm.newsletter.service.CommentService;

@RestController
public class CommentController {

@Autowired
CommentService commentService;

	
@GetMapping(path="/comment")
public List<Comments> getComments(){
		
		List<Comments> commentList=new ArrayList<>();
		
		commentList= commentService.getComments();
		
		return commentList;
		
		
	}

@PostMapping(path="/comment")
public Comments saveComment( @RequestBody Comments comment) {
	System.out.println("Comment" +comment.getComment());
		
		comment= commentService.saveComment(comment);
	
	
	return comment;
	
}

@DeleteMapping(path="/comment")
public void deleteComment(@RequestParam("commentId") Integer commentId) {
	
	commentService.deleteComment(commentId);
	
}
	
	
	

}
