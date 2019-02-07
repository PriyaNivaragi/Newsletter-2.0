
  package com.ibm.newsletter.controller;
  
  import java.util.ArrayList;
  import java.util.List;

  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
  @PostMapping("/getRecognition")
  public void saveRecognition(@RequestBody Recognition recognition) {
	recognitionService.addRecognition(recognition);
	  
  }
  @PutMapping("/getRecognition/{id}")
  public void updateRecognition(@RequestBody Recognition recognition,@PathVariable int id) {
	recognitionService.updateRecognition(id,recognition);
  }
  @DeleteMapping("/getRecognition/{id}")
  public void deleteRecognition(@PathVariable long id) {
	  recognitionService.deleteRecognition(id);
  }
  }
 