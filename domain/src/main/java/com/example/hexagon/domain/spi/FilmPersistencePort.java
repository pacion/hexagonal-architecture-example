package com.example.hexagon.domain.spi;

import com.example.hexagon.domain.model.Film;

public interface FilmPersistencePort {
    Film getFilmById(int filmId);
}
