package com.ibm.newsletter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.newsletter.dto.Data;
import com.ibm.newsletter.service.DataService;

@RestController

public class DataController {
	
	@Autowired
	DataService dataService;
	
	
	@GetMapping(path="/moduleData")
	public List<Data> getModuleData(@RequestParam("moduleId") int moduleId){
		
		List<Data> moduleData= new ArrayList<>();
		
		
		
		moduleData= dataService.getDatabyIssueNumberAndModuleId(moduleId);
		
		
		
		return moduleData;
		
	}
	
	@PostMapping(path="/moduleData")
	public List<Data> saveModuleData(@RequestBody List<Data> moduleData){
		
		moduleData= dataService.saveData(moduleData);
		
		
		return moduleData;
		
	}
	


}
