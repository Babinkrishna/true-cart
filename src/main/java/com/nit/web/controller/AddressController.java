package com.nit.web.controller;

import com.nit.web.entity.AddressEntity;
import com.nit.web.entity.BranchEntity;
import com.nit.web.service.AddressService;
import com.nit.web.service.BranchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("address")
@Controller
public class AddressController extends AbstractCRUDController<AddressEntity, Long> {

	Logger logger = LoggerFactory.getLogger(AddressController.class);

	@Autowired
	public AddressController(AddressService serviceImpl) {
		super(serviceImpl);
	}
}