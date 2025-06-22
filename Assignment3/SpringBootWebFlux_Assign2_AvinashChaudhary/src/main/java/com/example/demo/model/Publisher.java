package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("publishers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {

    @Id
    @JsonProperty("pubId")
    private String pubId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("address")
    private String address;
}
