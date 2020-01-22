package com.ibm.newsletter.entity;

import COM.ibm.db2.app.Blob;

import javax.persistence.*;

@Table(name = "IMAGES")
@Entity
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "IMAGE_ID", nullable = false)
    private int imageId;

    @Column(name = "MODULE_ID", nullable = false)
    private int moduleId;

    @Column(name = "ISSUE_NUMBER", nullable = false)
    private int issueNumber;

    @Column(name = "IMAGE", nullable = false)
    private byte[] image;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
