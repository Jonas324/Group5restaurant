package com.group5.restaurant.group5restaurant.review;

import javax.persistence.*;

@Entity
@Table(name = "Reviews")
public class Review {

    @Id
    @GeneratedValue
    private Long reviewId;

    @Column(name = "reviewerName")
    private String reviewerName;
    @Column(name = "grade")
    private int grade;

    public Review(Long reviewId, String reviewerName, int grade) {
        this.reviewId = reviewId;
        this.reviewerName = reviewerName;
        this.grade = grade;
    }

    public Review() {

    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
