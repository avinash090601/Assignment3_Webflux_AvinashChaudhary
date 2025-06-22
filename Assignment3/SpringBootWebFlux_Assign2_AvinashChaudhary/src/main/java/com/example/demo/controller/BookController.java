package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Mono<Book> createBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping
    public Flux<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}
