package com.web.services.resttemplate.Assignment_3;

import org.springframework.web.client.RestTemplate;

public class Post_Request {

/*
Question: How would you use RestTemplate to send a POST request with a
new Post object to the endpoint https://jsonplaceholder.typicode.com/posts?
 */

    public static void main(String[] args) {
        Post3 post = new Post3(200, 1, "Title", "Description");
        RestTemplate restTemplate = new RestTemplate();
        Post3 PostRequest = restTemplate.postForObject("https://jsonplaceholder.typicode.com/posts", post, Post3.class);

        System.out.println(PostRequest);
    }
}
