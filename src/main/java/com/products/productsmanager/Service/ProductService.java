package com.products.productsmanager.Service;

import com.products.productsmanager.Model.UseCase.DbProduct;
import com.products.productsmanager.Model.mongodb.ProductEntity;
import com.products.productsmanager.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService implements DbProduct {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void save(ProductEntity product) {
        this.productRepository.save(product);
    }
}
