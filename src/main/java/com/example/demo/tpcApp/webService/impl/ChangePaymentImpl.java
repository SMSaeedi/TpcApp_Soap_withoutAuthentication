package com.example.demo.tpcApp.webService.impl;

import com.example.demo.tpcApp.model.ChangePaymentMethodInput;
import com.example.demo.tpcApp.model.ChangePaymentMethodStatement;
import com.example.demo.tpcApp.webService.ChangePayment;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "ChangePayment")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class ChangePaymentImpl implements ChangePayment {

    public String getBusiName(Long c_id) throws Exception {
        return new ChangePaymentMethodStatement().getBusiName(c_id);
    }

    public String updateCPM(ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethodStatement().updateCPM(input);
    }
}