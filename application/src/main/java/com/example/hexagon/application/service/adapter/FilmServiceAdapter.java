package com.example.hexagon.application.service.adapter;

import com.example.hexagon.application.service.api.FilmService;
import com.example.hexagon.domain.model.Film;
import com.example.hexagon.domain.spi.FilmPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

public class FilmServiceAdapter implements FilmService {

    private final FilmPersistencePort filmPersistencePort;

    @Autowired
    public FilmServiceAdapter(FilmPersistencePort filmPersistencePort) {
        this.filmPersistencePort = filmPersistencePort;
    }

    @Override
    public Film getFilmById(int filmId) {
        System.out.println("getfilmById" + filmId);
        return filmPersistencePort.getFilmById(filmId);
    }
}
