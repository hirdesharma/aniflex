package dev.hirdesh.movies.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/movies")
public class MoviesController {

  @GetMapping
  public String getAllMovies() {
    return "movies";
  }

}
