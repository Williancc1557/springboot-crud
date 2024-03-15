package com.products.productsmanager.Controller;

import com.products.productsmanager.Model.UseCase.DbProduct;
import com.products.productsmanager.Model.mongodb.ProductEntity;
import com.products.productsmanager.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {

    @Autowired
    private ProductService productService;

//    @RequestMapping("/test")
//    ProductEntity get() {
//        return new ProductEntity("12", "will", "hello", 1234);
//    }
    @PostMapping("/")
    void save(@RequestBody ProductEntity body) {
        this.productService.save(body);
    }
}
