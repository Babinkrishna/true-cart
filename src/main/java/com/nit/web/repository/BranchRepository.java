package com.nit.web.repository;

import com.nit.web.entity.BranchEntity;
import com.nit.web.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<BranchEntity, Long> {
}
