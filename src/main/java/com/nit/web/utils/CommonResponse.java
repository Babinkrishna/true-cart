package com.nit.web.utils;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.nit.web.data.CommonResponseModel;

@Service
public class CommonResponse {


    /**
     * Common method to Success Response
     *
     * @param resultData
     * @return
     */
    public ResponseEntity<String> prepareSuccessResponseWithMessage(Object resultData, String message) {
        CommonResponseModel responseObject = new CommonResponseModel();
        List result = new ArrayList();
        if (resultData instanceof JSONObject) {
            result.add(resultData);
        } else if (resultData instanceof JSONArray) {
            result = (List) resultData;
        } else if (resultData instanceof List) {
            result = (List) resultData;
        } else {
            result.add(resultData);
        }
        responseObject.setResult(result);
        responseObject.setStatusCode(ApplicationConstants.SUCCESS_CODE);
        responseObject.setStatus(ApplicationConstants.SUCCESS_STATUS);
        responseObject.setMessage(message);
        Gson gson = new Gson();
        String resp = gson.toJson(responseObject);
        return new ResponseEntity<String>(resp, HttpStatus.OK);
    }


    /**
     * Common method to Success Response
     *
     * @param resultData
     * @return
     */
    public ResponseEntity<String> prepareFailedResponseWithMessage(Object resultData, String message) {
        CommonResponseModel responseObject = new CommonResponseModel();
        List result = new ArrayList();
        if (resultData instanceof JSONObject) {
            result.add(resultData);
        } else if (resultData instanceof JSONArray) {
            result = (List) resultData;
        } else if (resultData instanceof List) {
            result = (List) resultData;
        } else {
            result.add(resultData);
        }
        responseObject.setResult(result);
        responseObject.setStatusCode(ApplicationConstants.FAILED_CODE);
        responseObject.setStatus(ApplicationConstants.FAILED_STATUS);
        responseObject.setMessage(message);
        Gson gson = new Gson();
        String resp = gson.toJson(responseObject);
        return new ResponseEntity<String>(resp, HttpStatus.OK);
    }


}
