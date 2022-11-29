package com.group5.restaurant.group5restaurant.review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review,Long> {

    @Query("SELECT s FROM Review s WHERE s.reviewerName = ?1")
    Optional<Review> findGuestByName(String reviewerName);
}
