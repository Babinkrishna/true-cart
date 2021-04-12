package com.nit.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.web.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
