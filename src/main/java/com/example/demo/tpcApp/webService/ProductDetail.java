package com.example.demo.tpcApp.webService;


import com.example.demo.tpcApp.model.ProductDetailOutput;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.demo.example.com/")
public interface ProductDetail {

    @WebMethod(operationName = "productDetail")
    public ProductDetailOutput productDetail(
            @WebParam(name = "id") Long id) throws Exception;

    @WebMethod(operationName = "productDetailTest")
    public ProductDetailOutput productDetailHardCode(
            @WebParam(name = "id") Long id) throws Exception;
}