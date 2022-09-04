package com.digitalhouse.catalogservice.service;

import com.digitalhouse.catalogservice.dto.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService{

    @Autowired
    private MovieFeign movieFeign;

    @Override
    public List<MovieDTO> searchByGenre(String genre) {
        return movieFeign.allMoviesByGenre(genre);
    }
}
