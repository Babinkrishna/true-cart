package com.nit.web.repository;

import com.nit.web.entity.AddressEntity;
import com.nit.web.entity.BankInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}
