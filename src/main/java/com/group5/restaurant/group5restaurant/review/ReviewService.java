package com.group5.restaurant.group5restaurant.review;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    public List<Review> getReviews() {
        return reviewRepository.findAll();
    }


    public void addNewReview(Review review) {
    }

    public void deleteReview(Long reviewId) {
    }

    public void updateReview(Long reviewId, String reviewerName) {
    }
}
