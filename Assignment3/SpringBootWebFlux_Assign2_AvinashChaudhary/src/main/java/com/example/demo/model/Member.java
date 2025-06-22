package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("members")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @JsonProperty("membId")
    private String membId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("address")
    private String address;

    @JsonProperty("membType")
    private String membType;

    @JsonProperty("membDate")
    private String membDate;

    @JsonProperty("expiryDate")
    private String expiryDate;
}
