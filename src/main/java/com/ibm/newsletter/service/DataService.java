package com.ibm.newsletter.service;

import java.util.List;

import com.ibm.newsletter.dto.Data;

public interface DataService {
	
	public List<Data> getDatabyIssueNumberAndModuleId(int issueNumber, int moduleId);
	
	public String saveData(List<Data> data);
	
	

}
