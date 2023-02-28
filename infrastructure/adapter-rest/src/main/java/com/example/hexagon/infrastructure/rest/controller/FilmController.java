package com.example.hexagon.infrastructure.rest.controller;

import com.example.hexagon.domain.model.Film;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface FilmController {

    @GetMapping("/films/{filmId}")
    Film getFilmById(@PathVariable int filmId);

    @GetMapping("/films")
    List<Film> getFilms();

    @DeleteMapping("/films/{filmId}")
    void deleteFilmBy(@PathVariable int filmId);

    @PostMapping("/films")
    void addFilm(Film film);
}
