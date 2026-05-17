package com.example.movieslistapp;

public class Movie {

    int image;
    String name;
    String rating;

    public Movie(int image,
                 String name,
                 String rating) {

        this.image = image;
        this.name = name;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }
}