package com.products.productsmanager.Service;

import com.products.productsmanager.Model.UseCase.DbProduct;
import com.products.productsmanager.Model.mongodb.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductService implements DbProduct {

    @Override
    public void save(ProductEntity product) {
        //
    }
}
