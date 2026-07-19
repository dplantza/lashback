package com.lashback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class BookingAvailabilityDTO {

    private LocalDate date;

    private String time;
}