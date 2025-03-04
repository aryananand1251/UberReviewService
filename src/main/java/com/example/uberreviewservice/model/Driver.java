package com.example.uberreviewservice.model;

import jakarta.persistence.Column;
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
public class Driver extends BaseModel{

    private String name;

    @Column(nullable = false, unique = true)
    private String licenceNumber;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings=new ArrayList<>();
}
