package com.ibm.newsletter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.newsletter.entity.Data;
import com.ibm.newsletter.repositories.DataRepository;
import com.ibm.newsletter.util.NewsletterUtil;

@Component
public class DataServiceImpl implements DataService {
	
	@Autowired
	DataRepository dataRepo;
	
	@Autowired
	NewsletterUtil util;
	

	@Override
	public List<Data> getDatabyIssueNumberAndModuleId(int moduleId) {
		
		List<Data> moduleData= new ArrayList<>();
		
		moduleData= dataRepo.findDataByIssueNumberAndModuleId(util.getIssueNumber(), moduleId);
		
		return moduleData;
	}

	@Override
	public List<Data> saveData(List<Data> data) {
		// TODO Auto-generated method stub
		List<Data> moduleData= new ArrayList<>();
		moduleData=	dataRepo.saveAll(data);
		
		return moduleData;
	}

}
