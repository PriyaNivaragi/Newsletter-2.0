
  package com.ibm.newsletter.controller;
  
  import java.util.ArrayList;
  import java.util.List;

  import org.springframework.beans.factory.annotation.Autowired; 
  import org.springframework.web.bind.annotation.GetMapping; 
  import org.springframework.web.bind.annotation.RestController;
  
  import com.ibm.newsletter.dto.Recognition; 
  import com.ibm.newsletter.service.RecognitionService;
  
  @RestController 
  public class RecognitionController {
  
  @Autowired 
  RecognitionService recognitionService;
  
  @GetMapping(path = "/getRecognition") 
  public List<Recognition> getRecognition() {
	  
	  List<Recognition> recognitionList = new ArrayList<>();
  
	  recognitionList= recognitionService.getRecognition();
  
  return recognitionList; 
  
  }
  
  }
 