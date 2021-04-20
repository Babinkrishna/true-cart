package com.nit.web.service;

import com.nit.web.entity.ClientEntity;
import com.nit.web.entity.SupplierEntity;
import com.nit.web.repository.ClientRepository;
import com.nit.web.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService extends AbstractCRUDService<SupplierEntity, Long> {
    @Autowired
    public SupplierService(SupplierRepository repository) {
        super(repository);
}
}