package com.example.hexagon.infrastructure.persistence.inmemory.adapter;

import com.example.hexagon.domain.model.Film;
import com.example.hexagon.domain.spi.FilmPersistencePort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilmInMemoryAdapter implements FilmPersistencePort {

    private static final Map<Integer, Film> filmMap = new HashMap<Integer, Film>(0);

    @Override
    public Film getFilmById(int filmId) {
        return filmMap.get(filmId);
    }

    @Override
    public void addFilm(Film film) {
        filmMap.put(film.id(), film);
    }

    @Override
    public void removeFilmBy(int filmId) {
        filmMap.remove(filmId);
    }

    @Override
    public List<Film> getFilms() {
        return new ArrayList<>(filmMap.values());
    }
}
