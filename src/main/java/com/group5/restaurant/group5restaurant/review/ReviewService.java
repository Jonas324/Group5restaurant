package com.group5.restaurant.group5restaurant.review;

import com.group5.restaurant.group5restaurant.guest.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    public List<Review> getReviews(){
        return reviewRepository.findAll();
    }

    public void addNewReview(ReviewDTO review) {

        Review newReview = new Review();
        newReview.setReviewerName(review.getReviewerName());
        reviewRepository.save(newReview);
    }

    public void deleteReview(Long reviewId) {
        boolean exists = reviewRepository.existsById(reviewId);
        if (!exists){
            throw new IllegalStateException("guest with id" + reviewId + "does not exists");
        }
        reviewRepository.deleteById(reviewId);
    }

    @Transactional
    public void updateReview(Long reviewId, String reviewerName) {
        Review review = reviewRepository.findById(reviewId)
                .orElseThrow(() -> new IllegalStateException(
                        "guest with id" + reviewId + "does not exist"));

        if (reviewerName != null && reviewerName.length() > 0 &&
                !Objects.equals(review.getReviewerName(), reviewerName)){
            review.setReviewerName(reviewerName);
        }
    }
}
