package com.nit.web.repository;

import com.nit.web.entity.BranchEntity;
import com.nit.web.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
