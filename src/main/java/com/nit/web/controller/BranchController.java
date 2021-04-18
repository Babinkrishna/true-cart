package com.nit.web.controller;

import com.nit.web.entity.BranchEntity;
import com.nit.web.entity.ProductEntity;
import com.nit.web.service.BranchService;
import com.nit.web.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("branch")
@Controller
public class BranchController extends AbstractCRUDController<BranchEntity, Long> {

	Logger logger = LoggerFactory.getLogger(BranchController.class);

	@Autowired
	public BranchController(BranchService serviceImpl) {
		super(serviceImpl);
	}
}