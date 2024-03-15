package com.products.productsmanager.Model.UseCase;

import com.products.productsmanager.Model.mongodb.ProductEntity;

import java.util.List;

public interface DbProduct {
    void save(ProductEntity product);
    List<ProductEntity> findAll();
    List<ProductEntity> findByParam(String param, String name);
}
