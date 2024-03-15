package com.products.productsmanager.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {
    @RequestMapping("/")
    String get() {
        return "";
    }
}
