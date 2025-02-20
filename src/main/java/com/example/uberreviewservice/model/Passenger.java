package com.example.uberreviewservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Passenger extends BaseModel{

    private String name;

    @OneToMany(mappedBy = "passenger")
    private List<Booking> bookings=new ArrayList<>();
}
