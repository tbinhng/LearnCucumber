package com.guru99.learn.StepsDef;

import com.guru99.learn.Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by binh.nt on 5/2/2017.
 */
public class LoginSteps {
    Elements elements = new Elements();

    @Given("^I am on Login page$")
    public void i_am_on_Login_page(){
        elements.isOnLoginPage();
    }

    @When("^I enter username and password$")
    public void i_enter_username_and_password(){
        Assert.assertTrue(elements.loginPage());
    }

    @Then("^I see the login successful page$")
    public void i_see_the_login_successful_page(){
        elements.isOnLoginSuccessPage();
    }
}
