package com.example.hexagon.infrastructure.persistence.inmemory.config;

import com.example.hexagon.domain.spi.FilmPersistencePort;
import com.example.hexagon.infrastructure.persistence.inmemory.adapter.FilmInMemoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InMemoryAdapterConfiguration {

    @Bean
    public FilmPersistencePort getFilmPersistencePort() {
        return new FilmInMemoryAdapter();
    }
}
