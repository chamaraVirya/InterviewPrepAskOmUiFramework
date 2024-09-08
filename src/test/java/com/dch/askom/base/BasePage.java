package com.dch.askom.base;

import com.dch.askom.utils.ConfigLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    public void load(String endPoint){

        driver.get(ConfigLoader.getInstance().getBaseUrl() + endPoint);
    }

    public void waitForOverLaysToDisappear(By overLay){
        List<WebElement> overLays = driver.findElements(overLay);
        System.out.println("OVERLAY SIZE " + overLays.size());
        if (overLays.size() > 0 ){
            wait.until(ExpectedConditions.invisibilityOfAllElements(overLays));
            System.out.println("OVERLAYS INVISIBLE");
        } else {
            System.out.println("OVERLAY NOT FOUND");
        }
    }

}
