package com.example.hexagon.infrastructure.persistence.inmemory.config;

import com.example.hexagon.infrastructure.persistence.inmemory.adapter.FilmInMemoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spi.FilmPersistencePort;

@Configuration
public class InMemoryAdapterConfiguration {

    @Bean
    public FilmPersistencePort getProductPersistencePort() {
        return new FilmInMemoryAdapter();
    }
}
