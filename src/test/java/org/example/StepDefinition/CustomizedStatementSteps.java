package org.example.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.CustomizedStatementActions;
import org.openqa.selenium.WebDriver;

public class CustomizedStatementSteps {

    WebDriver driver;

    CustomizedStatementActions customizedStatementActions;

    public CustomizedStatementSteps(CommonSteps commonSteps, CustomizedStatementActions customizedStatementActions) {
        this.driver= commonSteps.getDriver();
        this.customizedStatementActions = customizedStatementActions;
    }
    @Given("when the user open application url")
    public void when_the_user_open_application_url() {
        driver.get("https://demo.guru99.com/V1/html/CustomisedStatementInput.php");

    }
    @When("user enter fill the form and click on submit")
    public void user_enter_fill_the_form_and_click_on_submit() {
        customizedStatementActions.EnterAccountNumber();
        customizedStatementActions.selectFromDate();
        customizedStatementActions.selectToDate();
        customizedStatementActions.enterLowerLimitAmount();
        customizedStatementActions.numberOfTransaction();
        customizedStatementActions.clickOnSubmit();
    }
    @Then("Customized Statement is generated successfully")
    public void customized_statement_is_generated_successfully() {
        System.out.println("Customized Statement is generated successfully");

    }
}
