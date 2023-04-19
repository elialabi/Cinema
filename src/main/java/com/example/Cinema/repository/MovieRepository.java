package com.example.Cinema.repository;

import com.example.Cinema.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {//String used to define the value of the database

}
