package com.nit.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.web.entity.UserRoleEntity;
import com.nit.web.repository.UserRoleRepository;

@Service
public class UserRoleService extends AbstractCRUDService<UserRoleEntity, Long> {
    @Autowired
    public UserRoleService(UserRoleRepository repository) {
        super(repository);
}
}