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
    public List<Review> getReview(){
        return reviewService.getReviews();
    }

    @PostMapping
    public void registerNewReview(@RequestBody Review review){
        reviewService.addNewReview(review);
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
