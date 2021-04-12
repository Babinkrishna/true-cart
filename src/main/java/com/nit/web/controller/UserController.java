package com.nit.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.web.entity.UserEntity;
import com.nit.web.service.UserService;

@RequestMapping("user")
@Controller
public class UserController extends AbstractCRUDController<UserEntity, Long> {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public UserController(UserService serviceImpl) {
        super(serviceImpl);
    }
}