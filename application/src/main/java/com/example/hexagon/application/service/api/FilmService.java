package com.example.hexagon.application.service.api;

import com.example.hexagon.domain.model.Film;

import java.util.List;

public interface FilmService {
    Film getFilmBy(int filmId);

    void addFilm(Film film);

    void removeFilmBy(int filmId);

    List<Film> getFilms();
}
