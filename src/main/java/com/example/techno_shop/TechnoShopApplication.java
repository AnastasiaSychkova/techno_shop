package com.example.techno_shop;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class TechnoShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechnoShopApplication.class, args);
    }

}
