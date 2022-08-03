package com.example.code.model.dto;

import com.example.code.model.modelUtils.Payment;
import com.example.code.model.modelUtils.Refund;
import lombok.Data;

import java.util.UUID;

@Data
public class ResponseHotelDTO {
    private UUID id;

    private String name;

    private String address;

    private String phoneNumber;

    private int numberOfReviewers;

    private double rating;

    private String description;

//    private Payment payment;
//
//    private Refund refund;

    private boolean donation;
}
