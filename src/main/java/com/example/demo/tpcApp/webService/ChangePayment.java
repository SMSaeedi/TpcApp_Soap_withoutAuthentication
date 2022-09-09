package com.example.demo.tpcApp.webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.example.demo.tpcApp.model.ChangePaymentMethodInput;

@WebService(targetNamespace = "http://impl.webService.changePayment.demo.example.com/")
public interface ChangePayment {

    @WebMethod(operationName = "getBusiName")
    public String getBusiName(@WebParam(name = "c_id") Long c_id) throws Exception;

    @WebMethod(operationName = "updateCPM")
    public String updateCPM(@WebParam(name = "input") ChangePaymentMethodInput input) throws Exception;
}