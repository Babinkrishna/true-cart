package com.nit.web.repository;

import com.nit.web.entity.ClientEntity;
import com.nit.web.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<SupplierEntity, Long> {
}
