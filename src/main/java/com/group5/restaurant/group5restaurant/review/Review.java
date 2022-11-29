package com.group5.restaurant.group5restaurant.review;

import javax.persistence.*;

@Entity
@Table(name = "Reviews")
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "reviewerName")
    private String reviewerName;
    @Column(name = "grade")
    private int grade;

    public Review(Long id, String reviewerName, int grade) {
        this.id = id;
        this.reviewerName = reviewerName;
        this.grade = grade;
    }

    public Review() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", reviewerName='" + reviewerName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
