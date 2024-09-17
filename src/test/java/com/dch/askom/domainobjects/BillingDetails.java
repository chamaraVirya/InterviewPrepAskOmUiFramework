package com.dch.askom.domainobjects;

public class BillingDetails {

    private String firstName;
    private String lastName;
    private String billingAddressLineOne;
    private String billingCity;
    private String billingState;
    private String billingPostalCode;
    private String billingEmail;

    public BillingDetails(String firstName, String lastName, String billingAddressLineOne,
                          String billingCity, String billingState, String billingPostalCode,
                          String billingEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.billingAddressLineOne = billingAddressLineOne;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingPostalCode = billingPostalCode;
        this.billingEmail = billingEmail;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBillingAddressLineOne() {
        return billingAddressLineOne;
    }

    public void setBillingAddressLineOne(String billingAddressLineOne) {
        this.billingAddressLineOne = billingAddressLineOne;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }
}
