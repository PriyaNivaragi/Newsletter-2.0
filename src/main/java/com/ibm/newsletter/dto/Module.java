package com.ibm.newsletter.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="NEWSLETTER_MODULE")
@Entity
public class Module {
	
	
	@Id
	private int moduleId;
	
	private String moduleName;
	
/*	@OneToMany(mappedBy = "module")
	private List<Comments> comments= new ArrayList<Comments>();*/
	
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	
	

}
