package com.fahrurben.ecommerceserviceapi;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fahrurben.ecommerceserviceapi.models.User;
import com.fahrurben.ecommerceserviceapi.repository.UserRepository;

@SpringBootApplication
public class EcommerceServiceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceServiceApiApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository repository, PasswordEncoder passwordEncoder) {
        return (args) -> {
            // create admin user
            User user = new User();
            user.setFirstName("John");
            user.setLastName("Doe");
            user.setUsername("admin@admin.com");
            user.setPassword(passwordEncoder.encode("secret"));
            user.setCreatedAt(LocalDateTime.now());
            user.setUpdatedAt(LocalDateTime.now());
            repository.save(user);
        };
    }
}
