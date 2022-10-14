package org.example.PageActions;

import org.example.PageElements.EditCustomerElements;
import org.example.StepDefinition.CommonSteps;
import org.openqa.selenium.WebDriver;

public class EditCustomerActions {
    WebDriver driver;

    EditCustomerElements editCustomerElements;

    public EditCustomerActions(CommonSteps commonSteps) {
        this.driver=commonSteps.getDriver();
        this.editCustomerElements=new EditCustomerElements(driver);
    }

    public void enterCustomerID(){
        editCustomerElements.customerID.sendKeys("mngr446493");
    }
    public void clickOnSubmit(){
        editCustomerElements.Submit.click();
    }
}

