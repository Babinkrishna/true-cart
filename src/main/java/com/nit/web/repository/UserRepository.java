package com.nit.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.web.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
