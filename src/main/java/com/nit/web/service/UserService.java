package com.nit.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.web.entity.UserEntity;
import com.nit.web.repository.UserRepository;

@Service
public class UserService extends AbstractCRUDService<UserEntity, Long> {
    @Autowired
    UserRepository repo;
    
    @Autowired
    public UserService(UserRepository repository) {
        super(repository);
        this.repo =repository;
}

	public UserEntity performAuthentication(UserEntity user) {
		// TODO Auto-generated method stub
		return repo.findByUserNameAndUserPass(user.getUserName(),user.getUserPass());
	}
}