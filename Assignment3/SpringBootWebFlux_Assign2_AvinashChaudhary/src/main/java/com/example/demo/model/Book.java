package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @JsonProperty("bookId")
    private String bookId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("author")
    private String author;

    @JsonProperty("price")
    private double price;

    @JsonProperty("available")
    private boolean available;

    @JsonProperty("dueDate")
    private String dueDate;

    @JsonProperty("returnDate")
    private String returnDate;

    @JsonProperty("issue")
    private String issue;

    @JsonProperty("publisherId")
    private String publisherId;
}
