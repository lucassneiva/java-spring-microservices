package com.digitalhouse.movieservice.repository;

import com.digitalhouse.movieservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findByGenre(String genre);

}
