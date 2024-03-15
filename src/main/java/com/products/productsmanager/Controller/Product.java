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
    @PostMapping("/product")
    void save(@Valid @RequestBody PostProductDto body) {
        ProductEntity product = new ProductEntity(body.name, body.description, body.price);
        this.productService.save(product);
    }

    @RequestMapping("/product")
    List<ProductEntity> findAll() {
        return this.productService.findAll();
    }

    @RequestMapping("/product/{param}/{name}")
    List<ProductEntity> findByParam(@PathVariable String name, @PathVariable String param) {
        return this.productService.findByParam(param, name);
    }
}
