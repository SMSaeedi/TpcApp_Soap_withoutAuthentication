package com.example.demo.tpcApp.model;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailOutput {
    private List<ProductDetailPojo> detailedProductsList = new ArrayList<>();

    public ProductDetailOutput() {

    }

    public List<ProductDetailPojo> getDetailedProductsList() {
        return detailedProductsList;
    }

    public void setDetailedProductsList(List<ProductDetailPojo> detailedProductsList) {
        this.detailedProductsList = detailedProductsList;
    }
}