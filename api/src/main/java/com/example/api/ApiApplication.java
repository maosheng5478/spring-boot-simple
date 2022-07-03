package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author maoshen5478
 */
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(ApiApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
