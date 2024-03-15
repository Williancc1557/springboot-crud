package com.products.productsmanager.Service;

import com.products.productsmanager.Model.UseCase.DbProduct;
import com.products.productsmanager.Model.mongodb.ProductEntity;
import com.products.productsmanager.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class ProductService implements DbProduct {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public void save(ProductEntity product) {
        this.productRepository.save(product);
    }

    @Override
    public List<ProductEntity> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public List<ProductEntity> findByParam(String param, String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where(param).is(name));
        return mongoTemplate.find(query, ProductEntity.class);
    }

    @Override
    public void deleteById(String id) {
        this.productRepository.deleteById(id);
    }

    @Override
    public void updateById(String id, ProductEntity product) {
        Optional<ProductEntity> existingProductOptional = this.productRepository.findById(id);
        ProductEntity existingProduct = existingProductOptional.get();

        if (!product.description.isBlank()) {
            existingProduct.description = product.description;
        }

        if (!product.name.isBlank()) {
            existingProduct.name = product.name;
        }

        if (product.price > 0) {
            existingProduct.price = product.price;
        }

        if (product.stock != existingProduct.stock) {
             existingProduct.stock = product.stock;
        }

        this.productRepository.save(existingProduct);
    }
}
