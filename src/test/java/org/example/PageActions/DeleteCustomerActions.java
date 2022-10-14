package org.example.PageActions;

import org.example.PageElements.DeleteCustomerElements;
import org.example.StepDefinition.CommonSteps;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerActions {

    WebDriver driver;

    DeleteCustomerElements deleteCustomerElements;

    public DeleteCustomerActions(CommonSteps commonSteps) {
        this.driver= commonSteps.getDriver();
        this.deleteCustomerElements=new DeleteCustomerElements(driver);
    }
    public void EnterCustomerID(){
        deleteCustomerElements.customerID.sendKeys("mngr446493");
    }

    public void clickOnSubmit(){
        deleteCustomerElements.submit.click();
    }
}
