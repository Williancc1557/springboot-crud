package com.products.productsmanager.Model.mongodb;

import io.micrometer.common.lang.NonNullFields;
import jakarta.validation.constraints.Size;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("product")
@NonNullFields()
public class ProductEntity {
    @MongoId
    public String id;
    public String name;
    public String description;
    public int price;
    public int stock;

    public ProductEntity(String name, String description, int price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }
}
