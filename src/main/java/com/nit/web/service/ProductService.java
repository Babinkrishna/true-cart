package com.nit.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.web.entity.ProductEntity;
import com.nit.web.repository.ProductRepository;

@Service
public class ProductService extends AbstractCRUDService<ProductEntity, Long> {
    @Autowired
    public ProductService(ProductRepository repository) {
        super(repository);
}
}