package org.example.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.EditCustomerActions;
import org.openqa.selenium.WebDriver;

public class EditCustomerSteps {
    WebDriver driver;

    EditCustomerActions editCustomerActions;

    public EditCustomerSteps(CommonSteps commonSteps,EditCustomerActions editCustomerActions) {
        this.driver= commonSteps.getDriver();
        this.editCustomerActions=editCustomerActions;
    }
    @Given("Open the application. url")
    public void open_the_application_url() {
        driver.get("https://demo.guru99.com/V1/html/EditCustomer.php");
    }
    @When("Enter customerID and click on submit")
    public void enter_customer_id_and_click_on_submit() {
        editCustomerActions.enterCustomerID();
        editCustomerActions.clickOnSubmit();


    }
    @Then("Edit Customer page is successfully open")
    public void edit_customer_page_is_successfully_open() {
        System.out.println("Edit Customer page is successfully open");

    }
}
