package com.nit.web.service;

import com.nit.web.entity.BranchEntity;
import com.nit.web.entity.OfficeEntity;
import com.nit.web.repository.BranchRepository;
import com.nit.web.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfficeService extends AbstractCRUDService<OfficeEntity, Long> {
    @Autowired
    public OfficeService(OfficeRepository repository) {
        super(repository);
}
}