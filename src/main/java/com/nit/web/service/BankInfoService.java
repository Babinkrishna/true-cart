package com.nit.web.service;

import com.nit.web.entity.BankInfoEntity;
import com.nit.web.entity.OfficeEntity;
import com.nit.web.repository.BankInfoRepository;
import com.nit.web.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankInfoService extends AbstractCRUDService<BankInfoEntity, Long> {
    @Autowired
    public BankInfoService(BankInfoRepository repository) {
        super(repository);
}
}