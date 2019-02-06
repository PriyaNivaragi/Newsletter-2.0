
  package com.ibm.newsletter.dto;
  
  import javax.persistence.Column; 
  import javax.persistence.Entity; 
  import javax.persistence.Id; 
  import javax.persistence.Table;
  
  @Entity
  
  @Table(name="NEWSLETTER_RECOGNITION") 
  		public class Recognition {
  
  @Id
  @Column(name="ISSUE_NUMBER", nullable=false) 
  private int issueNumber;
  
  @Column(name="STAR_OF_THE_MONTH") 
  private String starOfTheMonth;
  
  @Column(name="TOWER_NAME") 
  private String tower;
  
  @Column(name="IMAGE_PATH") 
  private String imagePath;
  
  @Column(name="CUSTOMER_DELIGHT") 
  private String customerDelight;

public int getIssueNumber() {
	return issueNumber;
}

public void setIssueNumber(int issueNumber) {
	this.issueNumber = issueNumber;
}

public String getStarOfTheMonth() {
	return starOfTheMonth;
}

public void setStarOfTheMonth(String starOfTheMonth) {
	this.starOfTheMonth = starOfTheMonth;
}

public String getTower() {
	return tower;
}

public void setTower(String tower) {
	this.tower = tower;
}

public String getImagePath() {
	return imagePath;
}

public void setImagePath(String imagePath) {
	this.imagePath = imagePath;
}

public String getCustomerDelight() {
	return customerDelight;
}

public void setCustomerDelight(String customerDelight) {
	this.customerDelight = customerDelight;
}
  
  
  
  }
 