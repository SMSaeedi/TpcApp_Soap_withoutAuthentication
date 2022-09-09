package com.example.demo.tpcApp.webService;

import com.example.demo.tpcApp.model.NewCustomerInput;
import com.example.demo.tpcApp.model.NewCustomerOutput;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.sql.SQLException;

@WebService(targetNamespace = "http://impl.webService.demo.example.com/")
public interface NewCustomer {

    @WebMethod(operationName = "insertCostumer")
    public Long insertCostumer(@WebParam(name = "input") NewCustomerInput cust) throws SQLException;

    @WebMethod(operationName = "testi")
    public NewCustomerOutput testi(@WebParam(name = "input") NewCustomerInput cust);

    @WebMethod(operationName = "deleteCostumer")
    public long deleteCostumer(@WebParam(name = "cust") Long cust_id) throws SQLException;

    @WebMethod(operationName = "getAddressID")
    public long getAddressID(@WebParam(name = "input") NewCustomerInput cust) throws SQLException;

}