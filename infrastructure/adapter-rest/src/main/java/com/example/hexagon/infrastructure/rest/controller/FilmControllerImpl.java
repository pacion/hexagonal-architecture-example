package com.example.hexagon.infrastructure.rest.controller;

import com.example.hexagon.application.service.api.FilmService;
import com.example.hexagon.domain.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmControllerImpl implements FilmController {

    private final FilmService filmService;

    @Autowired
    public FilmControllerImpl(FilmService filmService) {
        this.filmService = filmService;
    }

    @Override
    public Film getFilmById(int filmId) {
        System.out.println("controller " + filmId);
        return filmService.getFilmById(filmId);
    }
}
