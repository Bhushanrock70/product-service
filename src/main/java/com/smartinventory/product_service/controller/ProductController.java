package com.smartinventory.product_service.controller;

import com.smartinventory.product_service.model.Product;
import com.smartinventory.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

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


    @GetMapping("/{productCode}")
    public ResponseEntity<Product> getProductByCode(@PathVariable String productCode) {
        Product product = productService.getByCode(productCode);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
