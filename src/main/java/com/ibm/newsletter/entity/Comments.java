package com.ibm.newsletter.entity;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "COMMENTS")
public class Comments {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "COMMENT_ID", nullable = false)
    private long commentId;

    @Column(name = "MODULE_ID", nullable = false)
    private int moduleId;

    @Column(name = "ISSUE_NUMBER", nullable = false)
    private int issueNumber;

    @Column(name = "COMMENT", nullable = false)
    private String comment;

    @Column(name = "IS_REPLY", nullable = true)
    private boolean isReply;

    @Column(name = "PARENT_COMMENT_ID", nullable = true)
    private int parentCommentId;

    @Column(name = "COMMENTED_BY", nullable = false)
    private String commentedBy;

    @Column(name = "COMMENTED_AT", nullable = false)
    private Date commentedAt;


    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public int getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(int parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public String getCommentedBy() {
        return commentedBy;
    }

    public void setCommentedByName(String commentedBy) {
        this.commentedBy = commentedBy;
    }

    public Date getCommentedAt() {
        return commentedAt;
    }

    public void setCommentedAt(Date commentedAt) {
        this.commentedAt = commentedAt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isReply() {
        return isReply;
    }

    public void setReply(boolean isReply) {
        this.isReply = isReply;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setCommentedBy(String commentedBy) {
        this.commentedBy = commentedBy;
    }

}
