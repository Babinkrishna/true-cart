package com.nit.web.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nit.web.data.CommonResponseModel;
import com.nit.web.utils.ApplicationConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.web.entity.ProductEntity;
import com.nit.web.service.ProductService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RequestMapping("product")
@Controller
public class ProductController extends AbstractCRUDController<ProductEntity, Long> {

	Logger logger = LoggerFactory.getLogger(ProductController.class);
	@Autowired ProductService service;

	@Autowired
	public ProductController(ProductService serviceImpl) {
		super(serviceImpl);
		this.service=serviceImpl;
	}


	@PostMapping(value = "/addproduct", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = "multipart/form-data")
	ResponseEntity<String> addProduct(@RequestParam("product") String product,
													 @RequestParam(value = "file", required = false) final MultipartFile image
													 ) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		ProductEntity entity = mapper.readValue(product,ProductEntity.class);
//		entity.setImage(image.getInputStream().readAllBytes());
		this.service.add(entity);
		if(entity.getId()>0){
			return responseService.prepareSuccessResponseWithMessage(entity,ApplicationConstants.SUCCESS);

		}

		return responseService.prepareFailedResponseWithMessage("",ApplicationConstants.FAILED);
	}

}