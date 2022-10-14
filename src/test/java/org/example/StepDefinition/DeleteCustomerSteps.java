package org.example.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.DeleteCustomerActions;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerSteps {

    WebDriver driver;

    DeleteCustomerActions deleteCustomerActions;

    public DeleteCustomerSteps(CommonSteps commonSteps,DeleteCustomerActions deleteCustomerActions) {
        this.driver= commonSteps.getDriver();
        this.deleteCustomerActions=deleteCustomerActions;
    }

    @Given("open the Application url")
    public void open_the_application_url() {
        driver.get("https://demo.guru99.com/V1/html/DeleteCustomerInput.php");
    }
    @When("Enter the customerID and click on Submit")
    public void enter_the_customer_id_and_click_on_submit() {
        deleteCustomerActions.EnterCustomerID();
        deleteCustomerActions.clickOnSubmit();
    }
    @Then("customer is deleted successful")
    public void customer_is_deleted_successful() {
        System.out.println("customer is deleted successful");

    }
}
