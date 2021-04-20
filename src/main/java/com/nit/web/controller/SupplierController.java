package com.nit.web.controller;

import com.nit.web.entity.ClientEntity;
import com.nit.web.entity.SupplierEntity;
import com.nit.web.service.ClientService;
import com.nit.web.service.SupplierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("suppliers")
@Controller
public class SupplierController extends AbstractCRUDController<SupplierEntity, Long> {
	Logger logger = LoggerFactory.getLogger(SupplierController.class);
	@Autowired
	public SupplierController(SupplierService serviceImpl) {
		super(serviceImpl);
	}
}