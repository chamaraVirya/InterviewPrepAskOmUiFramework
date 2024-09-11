package com.dch.askom.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {

    public static WebDriver initializeDriver(String browser) {
        WebDriver driver;
        switch (browser) {
            case "chrome": driver = new ChromeDriver();
            break;
            case "firefox": driver = new FirefoxDriver();
            break;
            case "ie": driver = new InternetExplorerDriver();
            break;
            default: throw new RuntimeException("Invalid browser: " + browser);
        }

        driver.manage().window().maximize();
        return driver;
    }

}
