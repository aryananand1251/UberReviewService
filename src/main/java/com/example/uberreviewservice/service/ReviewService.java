package com.example.uberreviewservice.service;

import com.example.uberreviewservice.model.Booking;
import com.example.uberreviewservice.model.Review;
import com.example.uberreviewservice.repository.BookingRepository;
import com.example.uberreviewservice.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class ReviewService  implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }
    @Override
    public void run(String... args) throws Exception {

        Review r= Review.builder()
                .Content("Amazing Ride Quality")
                .rating(4.0).build();


        Booking b=Booking.builder()
                .review(r)
                .endTime(new Date())
                .build();
        bookingRepository.save(b);


    }
}
