package com.nit.web.controller;

import com.nit.web.entity.BranchEntity;
import com.nit.web.entity.OfficeEntity;
import com.nit.web.service.BranchService;
import com.nit.web.service.OfficeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("office")
@Controller
public class OfficeController extends AbstractCRUDController<OfficeEntity, Long> {

	Logger logger = LoggerFactory.getLogger(OfficeController.class);

	@Autowired
	public OfficeController(OfficeService serviceImpl) {
		super(serviceImpl);
	}
}