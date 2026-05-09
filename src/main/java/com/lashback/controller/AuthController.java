package com.lashback.controller;

import com.lashback.security.JwtUtil;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private static final String ADMIN_EMAIL = "admin@lash.com";
    private static final String ADMIN_PASSWORD = "123456xyz!#";

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, String> req) {

        if (ADMIN_EMAIL.equals(req.get("email")) &&
            ADMIN_PASSWORD.equals(req.get("password"))) {

            String token = JwtUtil.generateToken(req.get("email"));

            return Map.of(
                    "success", true,
                    "token", token
            );
        }

        return Map.of(
                "success", false,
                "message", "Invalid credentials"
        );
    }
}