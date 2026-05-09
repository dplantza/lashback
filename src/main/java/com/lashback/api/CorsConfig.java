package com.lashback.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(@NonNull CorsRegistry registry) {

        registry.addMapping("/**")

                // 👇 HERE is where allowedOrigins goes
                .allowedOrigins(
                        "http://localhost:3000",
                        "https://v0-lash-desire-business-o3ti3sr6j-dplantzas-projects.vercel.app"
                )

                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(false);
    }
}