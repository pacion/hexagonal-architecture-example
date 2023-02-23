package com.example.hexagon.application.service.config;

import com.example.hexagon.application.service.adapter.FilmServiceAdapter;
import com.example.hexagon.application.service.api.FilmService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import src.main.java.com.example.hexagon.domain.spi.FilmPersistencePort;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public FilmService getFilmService(FilmPersistencePort filmPersistencePort) {
        return new FilmServiceAdapter(filmPersistencePort);
    }
}
