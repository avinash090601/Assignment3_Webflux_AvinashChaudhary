package com.example.demo.service;

import com.example.demo.model.Publisher;
import com.example.demo.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public Mono<Publisher> addPublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    public Flux<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }
}
