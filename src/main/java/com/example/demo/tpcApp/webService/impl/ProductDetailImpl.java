package com.example.demo.tpcApp.webService.impl;

import com.example.demo.tpcApp.model.ProductDetailOutput;
import com.example.demo.tpcApp.model.ProductDetailStatement;
import com.example.demo.tpcApp.webService.ProductDetail;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "productDetailWebService")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class ProductDetailImpl implements ProductDetail {

    @Override
    public ProductDetailOutput productDetail(Long id) throws Exception {
        return new ProductDetailStatement().getData(id);
    }

    @Override
    public ProductDetailOutput productDetailHardCode(Long id) throws Exception {
        return new ProductDetailStatement().getHardCodeData(id);
    }
}