package com.ibm.newsletter.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUIZ")
public class Quiz {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private int issueNumber;

    private String question;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int questionId;

    private String answer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
