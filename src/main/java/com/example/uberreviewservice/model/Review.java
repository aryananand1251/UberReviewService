package com.example.uberreviewservice.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(schema = "review")
public class Review {

    @Id
    Long id;

    @Column(nullable = false )
    String Content;

    Double rating;

    @Column(nullable = false )
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(nullable = false )
    Date updatedAt;

}
