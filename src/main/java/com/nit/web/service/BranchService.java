package com.nit.web.service;

import com.nit.web.entity.BranchEntity;
import com.nit.web.entity.ProductEntity;
import com.nit.web.repository.BranchRepository;
import com.nit.web.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService extends AbstractCRUDService<BranchEntity, Long> {
    @Autowired
    public BranchService(BranchRepository repository) {
        super(repository);
}
}