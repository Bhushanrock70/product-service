package com.smartinventory.product_service.controller;

import com.smartinventory.product_service.model.Product;
import com.smartinventory.product_service.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }
    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.getById(id);
    }
}
