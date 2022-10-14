package org.example.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.NewAccountActions;
import org.openqa.selenium.WebDriver;

public class NewAccountSteps {

    WebDriver driver;

    NewAccountActions newAccountActions;

    public NewAccountSteps(CommonSteps commonSteps,NewAccountActions newAccountActions) {
        this.driver= commonSteps.getDriver();
        this.newAccountActions=newAccountActions;
    }

    @Given("Open the application url.")
    public void open_the_application_url() {
       driver.get("https://demo.guru99.com/V1/html/addAccount.php");
    }
    @When("Fill the new account form and click on submit")
    public void fill_the_new_account_form_and_click_on_submit() {
        newAccountActions.EnterCustomerId();
        newAccountActions.selectAccount();
        newAccountActions.ClickOnSubmit();

    }
    @Then("new account is generated successfully")
    public void new_account_is_generated_successfully() {
        System.out.println("new account is generated successfully");

    }

}
