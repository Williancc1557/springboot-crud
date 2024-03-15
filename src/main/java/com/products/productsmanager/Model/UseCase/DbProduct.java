package com.products.productsmanager.Model.UseCase;

import com.products.productsmanager.Model.mongodb.ProductEntity;

public interface DbProduct {
    void save(ProductEntity product);
}
