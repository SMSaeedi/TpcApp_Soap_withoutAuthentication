package com.example.demo.tpcApp.model;

public class NewProductsInput {

    private Long cutOffDuration;
    private String subjectString;
    private Long itemLimit;

    public Long getCutOffDuration() {
        return cutOffDuration;
    }

    public void setCutOffDuration(Long cutOffDuration) {
        this.cutOffDuration = cutOffDuration;
    }

    public Long getItemLimit() {
        return itemLimit;
    }

    public void setItemLimit(Long itemLimit) {
        this.itemLimit = itemLimit;
    }

    public String getSubjectString() {
        return subjectString;
    }

    public void setSubjectString(String subjectString) {
        this.subjectString = subjectString;
    }
}
