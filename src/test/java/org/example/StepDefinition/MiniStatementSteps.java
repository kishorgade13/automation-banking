package org.example.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.MiniStatementActions;
import org.openqa.selenium.WebDriver;

public class MiniStatementSteps {

    WebDriver driver;

    MiniStatementActions miniStatementActions;

    public MiniStatementSteps(CommonSteps commonSteps,MiniStatementActions miniStatementActions) {
        this.driver= commonSteps.getDriver();
        this.miniStatementActions=miniStatementActions;
    }
    @Given("Open the application url in browser")
    public void open_the_application_url_in_browser() {
       driver.get("https://demo.guru99.com/V1/html/MiniStatementInput.php");
    }
    @When("User Enter Account Number and click on submit")
    public void user_enter_account_number_and_click_on_submit() {
        miniStatementActions.enterAccountNumber();
        miniStatementActions.clickOnSubmit();

    }
    @Then("Mini statement is generated successfully")
    public void mini_statement_is_generated_successfully() {
        System.out.println("Mini statement is generated successfully");

    }
}
