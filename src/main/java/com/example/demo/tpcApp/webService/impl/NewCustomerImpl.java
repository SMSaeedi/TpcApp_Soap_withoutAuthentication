package com.example.demo.tpcApp.webService.impl;

import com.example.demo.tpcApp.model.NewCustomerInput;
import com.example.demo.tpcApp.model.NewCustomerOutput;
import com.example.demo.tpcApp.model.NewCustomerStatement;
import com.example.demo.tpcApp.webService.NewCustomer;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.sql.SQLException;

@WebService(serviceName = "newCustomerWebService")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class NewCustomerImpl implements NewCustomer {

    @Override
    public Long insertCostumer(NewCustomerInput cust) throws SQLException {
        return new NewCustomerStatement().insertCostumer(cust);
    }

    @Override
    public NewCustomerOutput testi(NewCustomerInput cust) {
        return new NewCustomerStatement().testViaHardCode(cust);
    }

    @Override
    public long deleteCostumer(Long cust_id) throws SQLException {
        return new NewCustomerStatement().deleteCostumer(cust_id);
    }

    @Override
    public long getAddressID(NewCustomerInput cust) throws SQLException {
        return new NewCustomerStatement().getAddressID(cust);
    }
}