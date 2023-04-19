package com.example.Cinema.repository;

import com.example.Cinema.models.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class MovieList {

    private List<Movie> movies;



    public MovieList() {
            this.movies = new ArrayList<>();
            this.movies.add(new Movie("Nope", 8.5, 120));
            this.movies.add(new Movie("US", 7.2, 110));
            this.movies.add(new Movie("Get Out", 10, 115));
            this.movies.add(new Movie("Nope", 8.9, 150));
    }


        public Movie getRandomMovie(){
            Random random = new Random();
            int randomIndex = random.nextInt(this.movies.size());
            return this.movies.get(randomIndex);
        }

    public List<Movie> getMovies() {
        return movies;
    }
    }


