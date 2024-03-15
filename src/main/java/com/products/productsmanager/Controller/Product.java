package com.products.productsmanager.Controller;

import com.products.productsmanager.Model.UseCase.DbProduct;
import com.products.productsmanager.Model.mongodb.ProductEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {
    private DbProduct dbProduct;

//    @RequestMapping("/test")
//    ProductEntity get() {
//        return new ProductEntity("12", "will", "hello", 1234);
//    }
    @PostMapping("/")
    void save(@RequestBody ProductEntity body) {
        this.dbProduct.save(body);
    }
}
