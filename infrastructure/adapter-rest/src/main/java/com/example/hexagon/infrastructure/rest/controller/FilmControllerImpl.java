package com.example.hexagon.infrastructure.rest.controller;

import com.example.hexagon.application.service.api.FilmService;
import com.example.hexagon.domain.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmControllerImpl implements FilmController {

    private final FilmService filmService;

    @Autowired
    public FilmControllerImpl(FilmService filmService) {
        this.filmService = filmService;
    }

    @Override
    public Film getFilmById(int filmId) {
        return filmService.getFilmBy(filmId);
    }

    @Override
    public List<Film> getFilms() {
        return filmService.getFilms();
    }

    @Override
    public void deleteFilmBy(int filmId) {
        filmService.removeFilmBy(filmId);
    }

    @Override
    public void addFilm(Film film) {
        filmService.addFilm(film);
    }
}
