package com.example.hexagon;

import com.example.hexagon.application.service.config.ApplicationConfiguration;
import com.example.hexagon.infrastructure.persistence.inmemory.config.InMemoryAdapterConfiguration;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

@SpringBootApplication
public class HexagonApplication {

    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(HexagonApplication.class, args);
    }

    @PostConstruct
    public void init() {
        var names = applicationContext.getBeanDefinitionNames();

        Arrays.stream(names).forEach(System.out::println);
    }
}
