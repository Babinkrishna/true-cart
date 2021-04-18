package com.nit.web.service;

import com.nit.web.entity.BranchEntity;
import com.nit.web.entity.ClientEntity;
import com.nit.web.repository.BranchRepository;
import com.nit.web.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService extends AbstractCRUDService<ClientEntity, Long> {
    @Autowired
    public ClientService(ClientRepository repository) {
        super(repository);
}
}