package com.dch.askom.hooks;

import com.dch.askom.context.TestContext;
import com.dch.askom.factory.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyHooks {

    private WebDriver driver;
    private final TestContext testContext;


    public MyHooks(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before
    public void before(Scenario scenario) {
        System.out.println("Before : thread id : " + Thread.currentThread().getId() + "," +
            "scenario name : " + scenario.getName());
        driver = DriverManager.initializeDriver(System.getProperty("browser", "chrome"));
        testContext.driver = driver;
    }
}
