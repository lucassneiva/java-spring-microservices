package com.digitalhouse.movieservice;

import com.digitalhouse.movieservice.model.Movie;
import com.digitalhouse.movieservice.service.impl.MovieServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MovieServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner run(MovieServiceImpl movieService){
		return args -> {
			movieService.saveMovie(new Movie(null,"Massacre da Serra Elétrica", "Terror", "http://movies.com/massacredaserraeletrica"));
			movieService.saveMovie(new Movie(null,"Bruxa de Blair", "Terror", "http://movies.com/bruxadeblair"));
			movieService.saveMovie(new Movie(null,"Carros 2", "Animação", "http://movies.com/carros2"));
		};
	}

}
