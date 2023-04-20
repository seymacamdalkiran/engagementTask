package com.engagement.stepDefs;

import com.engagement.pages.HomePage;
import com.engagement.utilities.ConfigurationReader;
import com.engagement.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Home_StepDefs {
    HomePage homePage =new HomePage();
    @Given("Go to the website")
    public void go_to_the_website() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("Accept cookies")
    public void accept_cookies() {
        homePage.acceptCookiesButton.click();
    }

    @Then("Verify that {string} is displayed")
    public void verify_that_is_displayed(String expected) {
        String actual=homePage.getText(expected);
        Assert.assertEquals(actual,expected);
    }

    @Then("Navigate to {string} module")
    public void navigate_to_module(String module) {
        homePage.clickOnTabs(module);
    }

}
