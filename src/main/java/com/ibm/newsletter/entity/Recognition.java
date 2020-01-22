
package com.ibm.newsletter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "RECOGNITION")
public class Recognition {

    @Id
    @Column(name = "RECOGNITION_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long recognitionId;

    @Column(name = "ISSUE_NUMBER")
    private int issueNumber;

    @Column(name = "STAR_OF_THE_MONTH")
    private String starOfTheMonth;

    @Column(name = "TOWER_NAME")
    private String tower;

    @Column(name = "IMAGE_ID")
    private int imageId;

    @Column(name = "CUSTOMER_DELIGHT")
    private String customerDelight;

    public Recognition() {
        super();
    }


    public Recognition(int recognitionId, int issueNumber, String starOfTheMonth, String tower, int imageId,
                       String customerDelight) {
        super();
        this.recognitionId = recognitionId;
        this.issueNumber = issueNumber;
        this.starOfTheMonth = starOfTheMonth;
        this.tower = tower;
        this.imageId = imageId;
        this.customerDelight = customerDelight;
    }

    public long getRecognitionId() {
        return recognitionId;
    }

    public void setRecognitionId(long id) {
        this.recognitionId = id;
    }

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

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getCustomerDelight() {
        return customerDelight;
    }

    public void setCustomerDelight(String customerDelight) {
        this.customerDelight = customerDelight;
    }

}
