package com.web.services.resttemplate.Assignment_1;

import org.springframework.web.client.RestTemplate;

public class Basic_Get_Request {


    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        int Id = 1;
        Post post = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/{id}", Post.class, Id);

        System.out.println(post);
    }
}
