package com.nit.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.web.entity.UserRoleEntity;
import com.nit.web.service.UserRoleService;

@RequestMapping("userrole")
@Controller
public class UserRoleController extends AbstractCRUDController<UserRoleEntity, Long> {

    Logger logger = LoggerFactory.getLogger(UserRoleController.class);

    @Autowired
    public UserRoleController(UserRoleService serviceImpl) {
        super(serviceImpl);
    }
}