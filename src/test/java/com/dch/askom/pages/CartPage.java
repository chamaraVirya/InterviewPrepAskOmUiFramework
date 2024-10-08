package com.dch.askom.pages;

import com.dch.askom.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

    @FindBy(css = "td[class='product-name'] a")
    private WebElement productNameFld;

    @FindBy(css = "input[type=\"number\"]")
    private WebElement productQuantityFld;

    @FindBy(css = ".checkout-button")
    private WebElement proceedToCheckoutBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName() {
        return wait.until(ExpectedConditions.visibilityOf(productNameFld)).getText();

    }

    public String getProductQuantity() {
        return wait.until(ExpectedConditions.visibilityOf(productQuantityFld)).
                getAttribute("value");
    }

    public void clickProceedToCheckoutBtn() {
        wait.until(ExpectedConditions.visibilityOf(proceedToCheckoutBtn)).click();
    }
}
