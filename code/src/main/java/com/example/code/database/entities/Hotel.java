package com.example.code.database.entities;

import com.example.code.database.utils.Payment;
import com.example.code.database.utils.Refund;
import lombok.Data;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Hotel extends BaseEntity{

    private String name;
    private String address;
    private String phoneNumber;

    private int numberOfReviewers;

    private double rating;

    @Lob
    private String description;

    private Payment payment;

    private Refund refund;

    private boolean donation;

    @OneToMany(mappedBy = "hotel")
    List<Review> reviewList;

    @OneToMany(mappedBy = "hotel")
    List<Room> rooms;

    @OneToMany(mappedBy = "hotel")
    List<Booking> bookings;

    @ManyToOne
    private City city;
}
