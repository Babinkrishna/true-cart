package com.nit.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.web.entity.ProductEntity;
import com.nit.web.service.ProductService;

@RequestMapping("product")
@Controller
public class ProductController extends AbstractCRUDController<ProductEntity, Long> {

	Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	public ProductController(ProductService serviceImpl) {
		super(serviceImpl);
	}
}