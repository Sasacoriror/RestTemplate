package com.web.services.resttemplate.Assignment_5;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

public class Error_Handling {

/*
Question:
How would you handle exceptions for failed HTTP requests when using
RestTemplate to interact with https://jsonplaceholder.typicode.com/posts/{id}?
 */

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts/{id}";
        int id = 1;

        try {
            Post5 post5 = restTemplate.getForObject(url, Post5.class, id);
            System.out.println(post5);
        } catch (HttpClientErrorException e) {
            System.out.println("Client Error:");
            System.out.println("Response Body: "+e.getResponseBodyAsString());
            System.out.println("Status code"+e.getStatusCode());
        } catch (HttpServerErrorException e) {
            System.out.println("Server Error:");
            System.out.println("Response Body: "+e.getResponseBodyAsString());
            System.out.println("Status code: "+e.getStatusCode());
        } catch (Exception e){
            System.out.println("Unexpected error: "+e.getMessage());
        }

    }
}
