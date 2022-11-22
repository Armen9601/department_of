package com.example.requestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@SpringBootApplication
@EnableCouchbaseRepositories(basePackages = "com.example.requestservice.repo")
public class RequestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RequestServiceApplication.class, args);
    }

}
