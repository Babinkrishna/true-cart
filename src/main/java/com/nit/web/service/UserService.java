package com.nit.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.web.entity.UserEntity;
import com.nit.web.repository.UserRepository;

@Service
public class UserService extends AbstractCRUDService<UserEntity, Long> {
    @Autowired
    public UserService(UserRepository repository) {
        super(repository);
}
}