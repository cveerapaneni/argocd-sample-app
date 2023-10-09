package com.mycom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class.
 */
@SpringBootApplication
public class GreetingService {

    /**
     * Entry point method.
     *
     * @param args
     *         Arguments to the main program.
     */
    public static void main(String[] args) {
        SpringApplication.run(GreetingService.class, args);
    }
}