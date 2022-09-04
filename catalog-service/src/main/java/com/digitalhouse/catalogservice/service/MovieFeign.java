package com.digitalhouse.catalogservice.service;

import com.digitalhouse.catalogservice.dto.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "MOVIE-SERVICE")
public interface MovieFeign {

    @GetMapping("/movies/{genre}")
    List<MovieDTO> allMoviesByGenre(@PathVariable String genre);
}
