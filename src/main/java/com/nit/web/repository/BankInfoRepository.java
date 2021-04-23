package com.nit.web.repository;

import com.nit.web.entity.BankInfoEntity;
import com.nit.web.entity.OfficeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankInfoRepository extends JpaRepository<BankInfoEntity, Long> {
}
