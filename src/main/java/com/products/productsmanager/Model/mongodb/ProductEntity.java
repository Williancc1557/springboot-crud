package com.products.productsmanager.Model.mongodb;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("product")
public class ProductEntity {
    @MongoId
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
