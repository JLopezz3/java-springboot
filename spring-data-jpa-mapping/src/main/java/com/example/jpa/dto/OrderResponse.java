package com.example.jpa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse {

    private String name;
    private String productName;

    // we had to generate constructor, because the query is only looking for name and productName
    // since we added price field, we had to create constructor.
    // if we didn't create extra field, no need for constructor
    public OrderResponse(String name, String productName) {
        this.name = name;
        this.productName = productName;
    }

    private int price;

}
