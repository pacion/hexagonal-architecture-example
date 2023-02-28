package com.example.hexagon.domain.spi;

import com.example.hexagon.domain.model.Film;

import java.util.List;

public interface FilmPersistencePort {
    Film getFilmById(int filmId);

    void addFilm(Film film);

    void removeFilm(Film film);

    List<Film> getFilms();
}
