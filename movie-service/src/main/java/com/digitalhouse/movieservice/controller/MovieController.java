package com.digitalhouse.movieservice.controller;

import com.digitalhouse.movieservice.model.Movie;
import com.digitalhouse.movieservice.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/{genre}")
    public ResponseEntity<List<Movie>> getMovies(@PathVariable String genre){
        return ResponseEntity.ok(movieService.allMoviesByGenre(genre));
    }

    @PostMapping
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.saveMovie(movie));
    }

}
