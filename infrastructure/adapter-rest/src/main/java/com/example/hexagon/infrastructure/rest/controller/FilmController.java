package main.java.com.example.hexagon.infrastructure.rest.controller;

import com.example.hexagon.domain.model.Film;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface FilmController {

    @GetMapping("/test")
    Film getFilmById(@PathVariable Integer filmId);
}
