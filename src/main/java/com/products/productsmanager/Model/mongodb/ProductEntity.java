package com.products.productsmanager.Model.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("product")
public class ProductEntity {
    @Id
    public String id; // UUID

    public String name;
    public String description;
    public int price;

    public ProductEntity(String id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}