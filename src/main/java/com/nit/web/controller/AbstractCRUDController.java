package com.nit.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.nit.web.data.PaginationResponseModel;
import com.nit.web.data.SearchModel;
import com.nit.web.service.AbstractCRUDService;
import com.nit.web.utils.ApplicationConstants;
import com.nit.web.utils.CommonResponse;

public abstract class AbstractCRUDController<T, S> {
    private AbstractCRUDService<T, S> abstractCRUDServiceImpl;
    //Logger logger = LoggerFactory.getLogger(AbstractCRUDController.class);
    @Autowired
    CommonResponse responseService;

    public AbstractCRUDController(AbstractCRUDService<T, S> serviceImpl) {
        abstractCRUDServiceImpl = serviceImpl;
    }

    /***
     *  method to get records based on Id
     * @param id
     * @return
     */
    @GetMapping(value = "/find/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> find(@PathVariable("id") S id) {
        Optional<T> optionalT = abstractCRUDServiceImpl.findById(id);
        if (optionalT.isPresent()) {
            return responseService.prepareSuccessResponseWithMessage(optionalT.get(), "");
        } else {
            return responseService.prepareFailedResponseWithMessage("", ApplicationConstants.FAILED_STATUS);
        }
    }

    /**
     * method to find all records without any restrictions
     *
     * @return
     */
    @GetMapping(value = "/findAll", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> findAll() {
        List<T> tList = abstractCRUDServiceImpl.findAll();
        return responseService.prepareSuccessResponseWithMessage(tList,"success");
    }

    /**
     * method to save entity
     *
     * @param model
     * @return
     */

    @PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> save(@RequestBody T model) {
        T modelRet = (T) abstractCRUDServiceImpl.add(model);
        return responseService.prepareSuccessResponseWithMessage(modelRet,"success");
    }

    /***
     * method to update entity
     * @param model
     * @return
     */
    @PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> update(@RequestBody T model) {
        T modelRet = (T) abstractCRUDServiceImpl.update(model);
        return responseService.prepareSuccessResponseWithMessage(modelRet,"success");
    }

    /**
     * Method to delete record
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/delete/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> delete(@PathVariable("id") S id) {
        abstractCRUDServiceImpl.deleteById(id);
        return new ResponseEntity<>("The requested " + id + " details are deleted successfully", HttpStatus.OK);
    }

    /**
     * pagination for all controllers
     *
     * @param searchModel
     * @return
     */
    @PostMapping(value = "/findallbypage", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<String> findAllByPage(@RequestBody SearchModel searchModel) {
        PaginationResponseModel pageResponse = new PaginationResponseModel();
        if(abstractCRUDServiceImpl.count()>0){


        if(searchModel.getMaxResult() ==0){
            searchModel.setMaxResult(Math.toIntExact(abstractCRUDServiceImpl.count()));
        }
        Pageable paging = PageRequest.of(searchModel.getFirstResult(), searchModel.getMaxResult());
        List<T> tList = new ArrayList<>();
        Page<T> pagedResult = (Page<T>) abstractCRUDServiceImpl.findAllByPage(paging);
        if (pagedResult.hasContent()) {
            tList = pagedResult.getContent();
            pageResponse.setItems(tList);
            pageResponse.setTotalCount(pagedResult.getTotalElements());
            return responseService.prepareSuccessResponseWithMessage(pageResponse, "success");
        }
        }
        return responseService.prepareFailedResponseWithMessage("",ApplicationConstants.FAILED);
    }


    /**
     * method to find all records without any restrictions
     *
     * @return
     */
    @GetMapping(value = "/count", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> count() {
       Long count = abstractCRUDServiceImpl.count();
        return responseService.prepareSuccessResponseWithMessage(count,"success");
    }
}
