package com.nit.web.controller;

import com.nit.web.entity.BranchEntity;
import com.nit.web.entity.ClientEntity;
import com.nit.web.service.BranchService;
import com.nit.web.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("client")
@Controller
public class ClientController extends AbstractCRUDController<ClientEntity, Long> {
	Logger logger = LoggerFactory.getLogger(ClientController.class);
	@Autowired
	public ClientController(ClientService serviceImpl) {
		super(serviceImpl);
	}
}