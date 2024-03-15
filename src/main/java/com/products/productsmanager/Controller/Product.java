package com.products.productsmanager.Controller;

import com.products.productsmanager.Controller.Dtos.PostProductDto;
import com.products.productsmanager.Model.UseCase.DbProduct;
import com.products.productsmanager.Model.mongodb.ProductEntity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Product {

    @Autowired
    private DbProduct productService;

//    @RequestMapping("/test")
//    ProductEntity get() {
//        return new ProductEntity("12", "will", "hello", 1234);
//    }

    @PostMapping("/product")
    void save(@Valid @RequestBody PostProductDto body) {
        ProductEntity product = new ProductEntity(body.name, body.description, body.price);
        this.productService.save(product);
    }

    @RequestMapping("/product")
    List<ProductEntity> findAll() {
        return this.productService.findAll();
    }

    @RequestMapping("/product/name/{name}")
    List<ProductEntity> findByName(@PathVariable String name) {
        return this.productService.findByName(name);
    }
}
