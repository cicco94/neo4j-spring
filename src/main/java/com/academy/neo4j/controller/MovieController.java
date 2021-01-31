package com.academy.neo4j.controller;

import com.academy.neo4j.entity.MovieEntity;
import com.academy.neo4j.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("movies")
public class MovieController {
    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @PutMapping("/")
    public MovieEntity createOrUpdateMovie(@RequestBody MovieEntity newMovie) {
        movieRepository.save(newMovie);
        return newMovie;
    }

    @GetMapping("/by-title")
    public MovieEntity byTitle(@RequestParam String title) {
        Optional<MovieEntity> res = movieRepository.findById(title);
        return res.orElseGet(MovieEntity::new);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable String id) {
        movieRepository.deleteById(id);
        return true;
    }
}