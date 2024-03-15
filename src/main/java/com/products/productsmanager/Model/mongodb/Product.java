package com.products.productsmanager.Model.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("product")
public class Product {
    @Id
    private String id; // UUID

    private String name;
    private String description;
    private int price;

    public Product(String id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
