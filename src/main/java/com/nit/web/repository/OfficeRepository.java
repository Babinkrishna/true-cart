package com.nit.web.repository;

import com.nit.web.entity.BranchEntity;
import com.nit.web.entity.OfficeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<OfficeEntity, Long> {
}
