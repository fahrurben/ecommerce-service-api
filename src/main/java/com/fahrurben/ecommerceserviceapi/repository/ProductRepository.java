package com.fahrurben.ecommerceserviceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fahrurben.ecommerceserviceapi.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
