package com.web.services.resttemplate.Assignment_4;

import com.web.services.resttemplate.Assignment_2.Post2;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Costum_RestTemplate {

/*
Question:
How can you create a custom RestTemplate with a custom timeout setting using
RestTemplateBuilder for interacting with https://jsonplaceholder.typicode.com/posts?
 */

    public static void main(String[] args) {

        RestTemplateBuilder builder = new RestTemplateBuilder();
        RestTemplate restTemplate = builder
                .connectTimeout(Duration.ofMillis(500))
                .readTimeout(Duration.ofMillis(1000))
                .build();

        ResponseEntity<Post4[]> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", Post4[].class);
        Post4[] postsArray = response.getBody();
        List<Post4> posts = Arrays.asList(postsArray);

        System.out.println(posts);
    }
}
