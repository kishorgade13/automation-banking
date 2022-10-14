package org.example.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.AddCustomerActions;
import org.openqa.selenium.WebDriver;

public class AddCustomerSteps {
    WebDriver driver;

    AddCustomerActions addCustomerActions;


    public AddCustomerSteps(CommonSteps commonSteps,AddCustomerActions addCustomerActions) {
        this.driver=commonSteps.getDriver();
        this.addCustomerActions=addCustomerActions;
    }
    @Given("Open the application url")
    public void open_the_application_url() {
        driver.get("https://demo.guru99.com/V1/html/addcustomerpage.php");
    }
    @When("Fill the form and click on submit")
    public void fill_the_form_and_click_on_submit() {
        addCustomerActions.enterCustomerDetails();
        addCustomerActions.clickOnSubmit();

    }
    @Then("the registration is successful")
    public void the_registration_is_successful() {
        System.out.println("the registration is successful");

    }
}
