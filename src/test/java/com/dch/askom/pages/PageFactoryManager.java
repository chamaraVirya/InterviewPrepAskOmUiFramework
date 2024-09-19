package com.dch.askom.pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {

    public static CartPage cartPage;
    public static CheckoutPage checkoutPage;
    public static StorePage storePage;

    public CartPage getCartPage(WebDriver driver) {
        return cartPage == null ? cartPage = new CartPage(driver) : cartPage;
    }

    public CheckoutPage getCheckoutPage(WebDriver driver) {
        return checkoutPage == null ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
    }

    public static StorePage getStorePage(WebDriver driver) {
        return storePage == null ? storePage = new StorePage(driver) : storePage;
    }
}
