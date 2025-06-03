package com.sidd.repository;

import com.sidd.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    // (Optionally) e.g. List<Movie> findByGenre(String genre);
}
