package com.example.hexagon;

import com.example.hexagon.application.service.config.ApplicationConfiguration;
import com.example.hexagon.infrastructure.persistence.inmemory.config.InMemoryAdapterConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class HexagonApplication {

    public static void main(String[] args) {
        SpringApplication.run(HexagonApplication.class, args);
    }
}
