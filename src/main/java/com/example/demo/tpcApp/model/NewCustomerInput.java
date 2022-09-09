package com.example.demo.tpcApp.model;

public class NewCustomerInput {

    private Long threadId;
    private String billingAddr1;
    private String billingAddr2;
    private String billingCity;
    private String billingCountry;
    private String billingState;
    private String billingZip;
    private String businessInfo;
    private String businessName;
    private String contactEmail;
    private String contactFName;
    private String contactLName;
    private String contactPhone;
    private String creditInfo;
    private String password;
    private String paymentMethod;
    private Long poId;

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public String getBillingAddr1() {
        return billingAddr1;
    }

    public void setBillingAddr1(String billingAddr1) {
        this.billingAddr1 = billingAddr1;
    }

    public String getBillingAddr2() {
        return billingAddr2;
    }

    public void setBillingAddr2(String billingAddr2) {
        this.billingAddr2 = billingAddr2;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public String getBusinessInfo() {
        return businessInfo;
    }

    public void setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactFName() {
        return contactFName;
    }

    public void setContactFName(String contactFName) {
        this.contactFName = contactFName;
    }

    public String getContactLName() {
        return contactLName;
    }

    public void setContactLName(String contactLName) {
        this.contactLName = contactLName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getCreditInfo() {
        return creditInfo;
    }

    public void setCreditInfo(String creditInfo) {
        this.creditInfo = creditInfo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Long getPoId() {
        return poId;
    }

    public void setPoId(Long poId) {
        this.poId = poId;
    }

    @Override
    public String toString() {
        return "NewCustomerInput{" +
                "threadId=" + threadId +
                ", billingAddr1='" + billingAddr1 + '\'' +
                ", billingAddr2='" + billingAddr2 + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingCountry='" + billingCountry + '\'' +
                ", billingState='" + billingState + '\'' +
                ", billingZip='" + billingZip + '\'' +
                ", businessInfo='" + businessInfo + '\'' +
                ", businessName='" + businessName + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactFName='" + contactFName + '\'' +
                ", contactLName='" + contactLName + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", creditInfo='" + creditInfo + '\'' +
                ", password='" + password + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", poId=" + poId +
                '}';
    }
}