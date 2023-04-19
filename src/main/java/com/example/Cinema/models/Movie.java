package com.example.Cinema.models;


import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "title", insertable = false, updatable = false)
    private String title;

    @Column(name = "rating")
    private double rating;

    @Column(name = "duration")
    private int duration;

//    Default constructors
    public Movie(){

    }

    public Movie(String title, double rating, int duration){
        this.title = title;
        this.rating = rating;
        this.duration = duration;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
