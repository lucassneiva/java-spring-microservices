package com.digitalhouse.catalogservice.controller;

import com.digitalhouse.catalogservice.dto.MovieDTO;
import com.digitalhouse.catalogservice.service.CatalogServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/catalog")
public class CatalogController {

    private final CatalogServiceImpl catalogService;

    @GetMapping("/{genre}")
    public ResponseEntity<List<MovieDTO>> allMoviesByGenre(@PathVariable String genre){
        return ResponseEntity.ok(catalogService.searchByGenre(genre));
    }



}
