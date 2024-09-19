package com.dch.askom.stepdefs;

import com.dch.askom.constants.EndPoint;
import com.dch.askom.context.TestContext;
import com.dch.askom.domainobjects.Product;
import com.dch.askom.pages.PageFactoryManager;
import com.dch.askom.pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StoreSteps {

    private final StorePage storePage;
    private final TestContext context;

    public StoreSteps(TestContext context) {
        this.context = context;
        storePage = PageFactoryManager.getStorePage(context.driver);
    }


    @Given("I am on the store page")
    public void i_am_on_the_store_page() {
       storePage.load(EndPoint.STORE.url);
    }
    @When("I add {string} to the cart")
    public void i_add_to_the_cart(Product product) {
        storePage.addToCart(product.getName());
    }
    @Then("I should see {int} {string} in the cart")
    public void i_should_see_in_the_cart(Integer int1, String string) {
       
    }


}
