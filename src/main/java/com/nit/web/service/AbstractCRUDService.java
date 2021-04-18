package com.nit.web.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractCRUDService<T, S> {
    JpaRepository<T, S> crudRepository;
    Logger logger = LoggerFactory.getLogger(AbstractCRUDService.class);

    public AbstractCRUDService(JpaRepository<T, S> crudRepository) {
        this.crudRepository = crudRepository;
    }

    public T add(T model) {
        return crudRepository.save(model);
    }

    public T update(T model) {
        return crudRepository.save(model);
    }

    public Optional<T> findById(S id) {
        return crudRepository.findById(id);
    }

    public void deleteById(S id) {
        crudRepository.deleteById(id);
    }


    public <T> List<T> findAll() {
        return (List<T>) crudRepository.findAll();
    }

    public List<T> saveAll(List<T> models) {
        return crudRepository.saveAll(models);
    }

    public <T> Page findAllByPage(Pageable paging) {
        return crudRepository.findAll(paging);
    }

    public Long count() {
        return  crudRepository.count();
    }
}
