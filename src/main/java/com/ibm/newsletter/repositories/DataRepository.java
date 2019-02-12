package com.ibm.newsletter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import com.ibm.newsletter.dto.Data;


public interface DataRepository extends JpaRepository<Data, Long > {
	
List<Data> findDataByIssueNumberAndModuleId(int issueNumber, int moduleId);


	
	

}
