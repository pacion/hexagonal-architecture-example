package com.example.hexagon.infrastructure.rest.controller;

import com.example.hexagon.domain.model.Film;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface FilmController {

    @GetMapping("/films/{filmId}")
    Film getFilmById(@PathVariable int filmId);
}
