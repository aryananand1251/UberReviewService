package com.example.uberreviewservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.uberreviewservice.model.Review;
import org.springframework.stereotype.Repository;

@Repository

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
