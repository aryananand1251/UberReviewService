package com.example.uberreviewservice.model;

import jakarta.persistence.*;
import lombok.*;




@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "review")
public class Review extends BaseModel {



    @Column(nullable = false )
    String Content;

    @Column(nullable = false )
    Double rating;



}
