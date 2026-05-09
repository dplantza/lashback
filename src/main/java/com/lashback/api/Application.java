package com.lashback.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot Application class for Lashback API
 */
@SpringBootApplication(scanBasePackages = "com.lashback")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
