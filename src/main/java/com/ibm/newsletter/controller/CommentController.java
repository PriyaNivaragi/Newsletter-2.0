package com.ibm.newsletter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.newsletter.dto.CommentDto;

@RestController
public class CommentController {
	
	
	
@GetMapping(path="/getComments")
public List<CommentDto> getComments(){
		
		List<CommentDto> commentList=new ArrayList<>();
		
		
		
		return commentList;
		
		
	}

@PostMapping(path="/postComment")
public CommentDto saveComment(@RequestParam("comment") CommentDto comment) {

	
	String message="";
	
	return comment;
	
}

@PostMapping(path="/deleteComment")
public void deleteComment(@RequestParam("comment")CommentDto comment) {
	
}
	
	
	

}
