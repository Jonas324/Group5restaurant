package com.group5.restaurant.group5restaurant.review;

public class ReviewDTO {

    private String reviewerName;
    private int grade;

    public ReviewDTO() {
    }

    public ReviewDTO(String reviewerName, int grade) {
        this.reviewerName = reviewerName;
        this.grade = grade;
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
