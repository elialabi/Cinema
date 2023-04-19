package com.example.Cinema.services;

import com.example.Cinema.models.Movie;
import com.example.Cinema.repository.MovieList;
import com.example.Cinema.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieList movieList;

    @Autowired
    private MovieRepository movieRepository;


    public Optional<Movie> getMovieById(long id){
        return movieRepository.findById(id);
    }

    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public Movie updateMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(long id) {
        movieRepository.deleteById(id);
    }

    public MovieRepository getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieList.getMovies();
    }
}
