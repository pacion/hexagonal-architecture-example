package com.example.hexagon.infrastructure.persistence.inmemory.adapter;

import src.main.java.com.example.hexagon.domain.model.Film;
import src.main.java.com.example.hexagon.domain.spi.FilmPersistencePort;

import java.util.HashMap;
import java.util.Map;

public class FilmInMemoryAdapter implements FilmPersistencePort {

    private static final Map<Integer, Film> filmMap = new HashMap<Integer, Film>(0);
}
