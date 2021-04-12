package com.nit.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.web.entity.UserRoleEntity;

public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long> {
}
