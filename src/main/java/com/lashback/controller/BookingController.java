package com.lashback.controller;


import com.lashback.dto.BookingAvailabilityDTO;
import com.lashback.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
@CrossOrigin
public class BookingController {


    private final BookingRepository bookingRepository;


    @GetMapping("/availability")
    public List<BookingAvailabilityDTO> availability() {

        return bookingRepository.findAll()
                .stream()
                .map(b -> new BookingAvailabilityDTO(
                        b.getDate(),
                        b.getTime()
                ))
                .toList();
    }
}