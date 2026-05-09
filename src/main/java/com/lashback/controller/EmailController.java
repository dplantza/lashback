package com.lashback.controller;

import com.lashback.dto.BookingRequest;
import com.lashback.services.EmailService;

import java.util.Map;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://v0-lash-desire-business-o3ti3sr6j-dplantzas-projects.vercel.app")
@RestController
@RequestMapping("/api")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
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
        """.formatted(req.firstName, req.lastName);

        return emailService.sendBookingEmail(json);
    }
}