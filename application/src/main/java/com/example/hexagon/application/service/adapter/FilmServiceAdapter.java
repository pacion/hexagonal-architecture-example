package com.example.hexagon.application.service.adapter;

import com.example.hexagon.application.service.api.FilmService;
import com.example.hexagon.domain.model.Film;
import com.example.hexagon.domain.spi.FilmPersistencePort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FilmServiceAdapter implements FilmService {

    private final FilmPersistencePort filmPersistencePort;

    private static final Logger logger = LogManager.getLogger(FilmServiceAdapter.class);

    @Autowired
    public FilmServiceAdapter(FilmPersistencePort filmPersistencePort) {
        this.filmPersistencePort = filmPersistencePort;
    }

    @Override
    public Film getFilmBy(int filmId) {
        logger.debug("message {}", () -> filmId);
        return filmPersistencePort.getFilmById(filmId);
    }

    @Override
    public void addFilm(Film film) {
        filmPersistencePort.addFilm(film);
    }

    @Override
    public void removeFilmBy(int filmId) {
        filmPersistencePort.removeFilmBy(filmId);
    }

    @Override
    public List<Film> getFilms() {
        return filmPersistencePort.getFilms();
    }
}
