package com.example.hexagon.application.service.config;

import com.example.hexagon.application.service.adapter.FilmServiceAdapter;
import com.example.hexagon.application.service.api.FilmService;
import com.example.hexagon.domain.spi.FilmPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public FilmService getFilmService(FilmPersistencePort filmPersistencePort) {
        return new FilmServiceAdapter(filmPersistencePort);
    }
}
