package com.example.Cinema.controllers;

import com.example.Cinema.models.Movie;
import com.example.Cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @Autowired
    private MovieService movieService;


    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        Movie newMovie = movieService.addMovie(movie);
        return new ResponseEntity<>(newMovie, HttpStatus.CREATED);
    }


    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        List<Movie> movieList = movieService.getAllMovies();
        return movieList;
    }


        @GetMapping(value = "/{id}")
        public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
            Optional<Movie> movie = movieService.getMovieById(id);
            if (movie.isPresent()) {
                return new ResponseEntity<>(movie.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

            }
        }



    }

