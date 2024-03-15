package com.products.productsmanager.Model.UseCase;

import com.products.productsmanager.Controller.Product;
import com.products.productsmanager.Model.mongodb.ProductEntity;

import java.util.List;

public interface DbProduct {
    void save(ProductEntity product);
    List<ProductEntity> findAll();
    List<ProductEntity> findByParam(String param, String name);
    void deleteById(String id);

    void updateById(String id, ProductEntity product);

}
