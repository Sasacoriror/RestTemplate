package com.web.services.resttemplate.Assignment_2;

import com.web.services.resttemplate.Assignment_1.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class Handling_List_of_Objects {

/*
Question:
You need to fetch a list of Post objects from the API endpoint https://jsonplaceholder.typicode.com/posts.
How would you retrieve and map the list using RestTemplate?
 */

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Post[]> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", Post[].class);
        Post[] postsArray = response.getBody();
        List<Post> posts = Arrays.asList(postsArray);

        System.out.println(posts);
    }

}
