package com.example.demo.repository;

import com.example.demo.model.Publisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends ReactiveMongoRepository<Publisher, String> {
}
