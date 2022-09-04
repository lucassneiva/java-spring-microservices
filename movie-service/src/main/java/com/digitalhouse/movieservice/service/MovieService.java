package com.digitalhouse.movieservice.service;

import com.digitalhouse.movieservice.model.Movie;

import java.util.List;

public interface MovieService {

    Movie saveMovie(Movie movie);

    List<Movie> allMoviesByGenre(String genre);

}
