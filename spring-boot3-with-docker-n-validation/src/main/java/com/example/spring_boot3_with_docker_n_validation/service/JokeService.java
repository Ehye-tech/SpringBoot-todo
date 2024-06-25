package com.example.spring_boot3_with_docker_n_validation.service;
import com.example.spring_boot3_with_docker_n_validation.model.Joke;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;

@Service
@RequiredArgsConstructor
public class JokeService {
    private RestTemplate restTemplate;

    private static final String JOKE_URL = "http://localhost:3000/generate";


    public Joke getJoke(String data) {
        String prompt = "make a joke with: "+data;
        String requestBody = String.format("{\"prompt\": \"%s\"}", prompt);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<>(requestBody);

        ResponseEntity<Joke> response = restTemplate.postForEntity(JOKE_URL, entity, Joke.class); // Adjust type if needed

        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            // Handle error response
            throw new RuntimeException("Error fetching joke: " + response.getStatusCodeValue());
        }
    }
}

