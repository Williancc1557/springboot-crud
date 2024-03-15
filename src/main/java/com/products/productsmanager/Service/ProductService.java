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
}
