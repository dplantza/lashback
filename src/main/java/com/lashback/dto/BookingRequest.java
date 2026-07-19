package com.lashback.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String service;

    private String time;

    private LocalDate date;

    private String notes;
}