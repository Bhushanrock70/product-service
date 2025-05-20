package com.smartinventory.product_service.repository;

import com.smartinventory.product_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Optional<Product> findByProductCode(String productCode);

}
