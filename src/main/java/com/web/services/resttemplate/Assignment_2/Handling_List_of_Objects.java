package com.web.services.resttemplate.Assignment_2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class Handling_List_of_Objects {

/*
Question:
How would you use RestTemplate to send a POST request with a new Post object to the endpoint
https://jsonplaceholder.typicode.com/posts?
 */

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Post2[]> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", Post2[].class);
        Post2[] postsArray = response.getBody();
        List<Post2> posts = Arrays.asList(postsArray);

        System.out.println(posts);
    }

}
