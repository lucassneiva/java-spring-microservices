package com.digitalhouse.movieservice.service.impl;

import com.digitalhouse.movieservice.model.Movie;
import com.digitalhouse.movieservice.repository.MovieRepository;
import com.digitalhouse.movieservice.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> allMoviesByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }
}
