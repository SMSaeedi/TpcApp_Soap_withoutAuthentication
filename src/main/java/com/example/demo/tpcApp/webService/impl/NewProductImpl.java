package com.example.demo.tpcApp.webService.impl;


import com.example.demo.tpcApp.model.NewProductModel;
import com.example.demo.tpcApp.model.NewProductsInput;
import com.example.demo.tpcApp.model.NewProductsOutput;
import com.example.demo.tpcApp.model.NewProductsStatement;
import com.example.demo.tpcApp.webService.NewProduct;


import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;

@WebService(serviceName = "newProductWebService")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class NewProductImpl implements NewProduct {

    @Override
    public List<NewProductModel> newProducts(NewProductsInput subject) throws Exception {
        return new NewProductsStatement().insertNew(subject);
    }

    @Override
    public NewProductsOutput newProductsTest(NewProductsInput input) throws Exception {
        return new NewProductsStatement().hardCodeTest(input);
    }

}