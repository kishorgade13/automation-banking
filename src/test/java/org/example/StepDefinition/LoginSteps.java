package org.example.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.LoginActions;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver;

    LoginActions loginActions;

    public LoginSteps(CommonSteps commonSteps, LoginActions loginActions) {
        this.driver=commonSteps.getDriver();
        this.loginActions=loginActions;
    }
    @Given("open the application url")
    public void open_the_application_url() {
        driver.get("https://demo.guru99.com/V1/");

    }
    @When("I enter userID and password and then click on login button")
    public void i_enter_user_id_and_password_and_then_click_on_login_button() {
        loginActions.enterUserId();
        loginActions.enterPassword();
        loginActions.clickOnLogin();

    }
    @Then("login should be successful")
    public void login_should_be_successful() {
        System.out.println("login is successful");
    }
}


