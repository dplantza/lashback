package com.lashback.dto;

import lombok.Data;

@Data
public class BookingRequest {
    public String firstName;
    public String lastName;
    public String email;
    public String phone;
    public String service;
    public String date;
    public String time;
    public String notes;
}