package com.digitalhouse.catalogservice.service;

import com.digitalhouse.catalogservice.dto.MovieDTO;

import java.util.List;

public interface CatalogService {

    List<MovieDTO> searchByGenre(String genre);
}
