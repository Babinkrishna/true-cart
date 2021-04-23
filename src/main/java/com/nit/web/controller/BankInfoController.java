package com.nit.web.controller;

import com.nit.web.entity.BankInfoEntity;
import com.nit.web.entity.OfficeEntity;
import com.nit.web.service.BankInfoService;
import com.nit.web.service.OfficeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("bankinfo")
@Controller
public class BankInfoController extends AbstractCRUDController<BankInfoEntity, Long> {

	Logger logger = LoggerFactory.getLogger(BankInfoController.class);

	@Autowired
	public BankInfoController(BankInfoService serviceImpl) {
		super(serviceImpl);
	}
}