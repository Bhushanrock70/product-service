package com.smartinventory.product_service.repository;

import com.smartinventory.product_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
