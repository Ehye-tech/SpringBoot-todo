package com.example.spring_boot3_with_docker_n_validation.controller;


import com.example.spring_boot3_with_docker_n_validation.model.Joke;
import com.example.spring_boot3_with_docker_n_validation.service.JokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class JokeController {
    final JokeService jokeService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/joke")
    public Joke updateJoke(@PathVariable("data") String data) {

        return jokeService.getJoke(data);
    }
}


