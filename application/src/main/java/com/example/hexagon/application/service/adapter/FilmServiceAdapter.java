package com.example.hexagon.application.service.adapter;

import com.example.hexagon.application.service.api.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import src.main.java.com.example.hexagon.domain.spi.FilmPersistencePort;

public class  FilmServiceAdapter implements FilmService {

    private FilmPersistencePort filmPersistencePort;

    @Autowired
    public FilmServiceAdapter(FilmPersistencePort filmPersistencePort) {
        this.filmPersistencePort = filmPersistencePort;
    }


}
