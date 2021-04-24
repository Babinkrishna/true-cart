package com.nit.web.service;

import com.nit.web.entity.AddressEntity;
import com.nit.web.entity.BankInfoEntity;
import com.nit.web.repository.AddressRepository;
import com.nit.web.repository.BankInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends AbstractCRUDService<AddressEntity, Long> {
    @Autowired
    public AddressService(AddressRepository repository) {
        super(repository);
}
}