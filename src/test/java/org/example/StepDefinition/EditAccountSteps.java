package org.example.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.EditAccountActions;
import org.openqa.selenium.WebDriver;

public class EditAccountSteps {

    WebDriver driver;

    EditAccountActions editAccountActions;

    public EditAccountSteps(CommonSteps commonSteps,EditAccountActions editAccountActions) {
        this.driver=commonSteps.getDriver();
        this.editAccountActions=editAccountActions;
    }

    @Given("Open the Application url")
    public void open_the_application_url() {
        driver.get("https://demo.guru99.com/V1/html/editAccount.php");
    }
    @When("Enter the Account No. and click on Submit")
    public void enter_the_account_no_and_click_on_submit() {
        editAccountActions.EnterAccountNo();
        editAccountActions.clickOnAccSubmit();

    }
    @Then("Edit Account is Successful")
    public void edit_account_is_successful() {
        System.out.println("Edit Account is Successful");

    }

}
