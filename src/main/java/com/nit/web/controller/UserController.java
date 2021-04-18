package com.nit.web.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.web.entity.UserEntity;
import com.nit.web.service.UserService;
import com.nit.web.utils.ApplicationConstants;

@RequestMapping("user")
@Controller
public class UserController extends AbstractCRUDController<UserEntity, Long> {

    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    
    UserService service;

    @Autowired
    public UserController(UserService serviceImpl) {
    	super(serviceImpl);
        this.service =serviceImpl;       
    }
    
    
	@PostMapping(value = "/login", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> login(@RequestBody UserEntity user) throws IOException {
		UserEntity result = service.performAuthentication(user);
		if (result !=null && result.getId() !=null) {
			return responseService.prepareSuccessResponseWithMessage(result,
					ApplicationConstants.SUCCESS_AUTHENTICATION);
		}
		return responseService.prepareFailedResponseWithMessage(ApplicationConstants.EMPTY_ARRAY, ApplicationConstants.FAILED);
	}
}