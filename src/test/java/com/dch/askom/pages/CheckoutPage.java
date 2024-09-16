package com.dch.askom.pages;

import com.dch.askom.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage extends BasePage {

    @FindBy(id = "billing_first_name") private WebElement billingFirstNameFld;
    @FindBy(id = "billing_last_name") private WebElement billingLastNameFld;
    @FindBy(id = "billing_address_1") private WebElement billingAddressLine1Fld;
    @FindBy(id = "billing_city") private WebElement billingCityFld;
    @FindBy(id = "billing_state") private WebElement billingStateFld;
    @FindBy(id = "billing_postcode") private WebElement billingPostcodeFld;
    @FindBy(id = "billing_email") private WebElement billingEmailFld;
    @FindBy(id = "place_order") private WebElement placeOrderBtn;



    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage enterBillingFirstName(String billingFirstName) {
        WebElement e =wait.until(ExpectedConditions.visibilityOf(billingFirstNameFld));
        e.clear();
        e.sendKeys(billingFirstName);
        return this;
    }

    public CheckoutPage enterBillingLastName(String billingLastName) {
        WebElement e =wait.until(ExpectedConditions.visibilityOf(billingLastNameFld));
        e.clear();
        e.sendKeys(billingLastName);
        return this;
    }

    public CheckoutPage enterBillingAddressLineOne(String billingAddressLineOne) {
        WebElement e =wait.until(ExpectedConditions.visibilityOf(billingAddressLine1Fld));
        e.clear();
        e.sendKeys(billingAddressLineOne);
        return this;
    }

    public CheckoutPage enterBillingCity(String billingCity) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingCityFld));
        e.clear();
        e.sendKeys(billingCity);
        return this;
    }

    public CheckoutPage enterBillingState(String billingState){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingStateFld));
        e.clear();
        e.sendKeys(billingState);
        return this;
    }

    public CheckoutPage enterBillingPostcode(String billingPostcode){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingPostcodeFld));
        e.clear();
        e.sendKeys(billingPostcode);
        return this;
    }

    public CheckoutPage enterBillingEmail(String billingEmail){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingEmailFld));
        e.clear();
        e.sendKeys(billingEmail);
        return this;
    }

    public CheckoutPage clickPlaceOrderBtn() {
        wait.until(ExpectedConditions.visibilityOf(placeOrderBtn)).click();
        return this;
    }
}
