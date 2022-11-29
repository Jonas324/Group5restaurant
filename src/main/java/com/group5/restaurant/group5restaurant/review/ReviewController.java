package com.group5.restaurant.group5restaurant.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Review")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }


    @GetMapping
    public ResponseEntity<List<Review>> getAllReviews() {
        List<Review> reviews = reviewService.getReviews();
        if (reviews.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Review> registerNewReview(@RequestBody Review review) {
        reviewService.addNewReview(review);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{reviewId}")
    public void deleteReview(@PathVariable("reviewId") Long reviewId){
        reviewService.deleteReview(reviewId);
    }

    @PutMapping(path = "{reviewId}")
    public void updateReview(
            @PathVariable("reviewId") Long reviewId,
            @RequestParam(required = false) String reviewerName){
        reviewService.updateReview(reviewId, reviewerName);
    }
}
