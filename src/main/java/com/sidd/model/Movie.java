package com.sidd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String genre;
    private Integer year;
    private String director;

    public Movie() { }

    public Movie(String title, String description, String genre, Integer year, String director) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.year = year;
        this.director = director;
    }

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }
}
