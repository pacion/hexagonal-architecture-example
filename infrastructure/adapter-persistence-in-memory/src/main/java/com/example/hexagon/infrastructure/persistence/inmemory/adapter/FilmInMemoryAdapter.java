package com.example.hexagon.infrastructure.persistence.inmemory.adapter;

import com.example.hexagon.domain.model.Film;
import com.example.hexagon.domain.spi.FilmPersistencePort;

import java.util.HashMap;
import java.util.Map;

public class FilmInMemoryAdapter implements FilmPersistencePort {

    private static final Map<Integer, Film> filmMap = new HashMap<Integer, Film>(0);

    @Override
    public Film getFilmById(int filmId) {
        filmMap.put(1, new Film());

        return filmMap.get(filmId);
    }
}
