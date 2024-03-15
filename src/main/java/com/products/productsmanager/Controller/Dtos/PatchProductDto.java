package com.products.productsmanager.Controller.Dtos;

import jakarta.validation.constraints.Size;

public class PatchProductDto {

    @Size(max = 200, min = 3, message = "[3 - 200] name character limit")
    public String name;
    @Size(min = 30, max = 150, message = "[30 - 150] description character limit")
    public String description;
    public int price;
}
