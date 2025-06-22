package com.example.demo.controller;

import com.example.demo.model.Publisher;
import com.example.demo.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/publishers")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @PostMapping
    public Mono<Publisher> createPublisher(@RequestBody Publisher publisher) {
        return publisherService.addPublisher(publisher);
    }

    @GetMapping
    public Flux<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }
}
