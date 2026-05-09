package com.lashback.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Main Spring Boot Application class for Lashback API
 */
@SpringBootApplication
@EntityScan("com.lashback.model")
@EnableJpaRepositories("com.lashback.repository")
@ComponentScan("com.lashback")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
