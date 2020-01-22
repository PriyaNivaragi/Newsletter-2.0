package com.ibm.newsletter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ibm.newsletter.entity.Comments;
import com.ibm.newsletter.service.CommentService;

@RestController
@RequestMapping ("/comment")
public class CommentController {

@Autowired
CommentService commentService;

	
@GetMapping
public List<Comments> getComments(){
		
		List<Comments> commentList=new ArrayList<>();
		
		commentList= commentService.getComments();
		
		return commentList;
		
		
	}

@PostMapping
public Comments saveComment( @RequestBody Comments comment) {
	System.out.println("Comment" +comment.getComment());
		
		comment= commentService.saveComment(comment);
	
	
	return comment;
	
}

@DeleteMapping
public void deleteComment(@RequestParam("commentId") Integer commentId) {
	
	commentService.deleteComment(commentId);
	
}
	
	
	

}
