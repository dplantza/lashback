package com.lashback.controller;

import com.lashback.dto.BookingRequest;
import com.lashback.model.Booking;
import com.lashback.repository.BookingRepository;
import com.lashback.services.EmailService;

import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmailController {

    private final EmailService emailService;
    private final  BookingRepository bookingRepository;

    public EmailController(EmailService emailService, BookingRepository bookingRepository) {
        this.emailService = emailService;
        this.bookingRepository = bookingRepository;
    }

    @PostMapping("/email")
    public Map<String, Object> send(@RequestBody BookingRequest req) {

        String json = """
        {
          "from": "Lash Studio <onboarding@resend.dev>",
          "to": "daaanai@gmail.com",
          "subject": "New Booking",
          "html": "<h1>New booking from %s %s</h1>"
        }
        """.formatted(req.getFirstName(), req.getLastName());



    Booking booking = new Booking();
    booking.setFirstName(req.getFirstName());
    booking.setLastName(req.getLastName());
    booking.setEmail(req.getEmail());
    booking.setPhone(req.getPhone());
    booking.setService(req.getService());
    booking.setTime(req.getTime());
    booking.setNotes(req.getNotes());
    booking.setDate(req.getDate());

    bookingRepository.save(booking

    );
        return emailService.sendBookingEmail(json);
    }
}