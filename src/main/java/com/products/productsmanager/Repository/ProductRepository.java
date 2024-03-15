package com.products.productsmanager.Repository;

import com.products.productsmanager.Model.mongodb.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductRepository extends MongoRepository<ProductEntity, String> {
    @Query("{name:'?0'}")
    List<ProductEntity> findItemByName(String name);

    @Query()
    List<ProductEntity> findAllBy(String category);
}
