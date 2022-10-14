package org.example.PageActions;

import org.example.PageElements.EditAccountElement;
import org.example.StepDefinition.CommonSteps;
import org.openqa.selenium.WebDriver;

public class EditAccountActions {

    WebDriver driver;

    EditAccountElement editAccountElement;

    public EditAccountActions(CommonSteps commonSteps) {
        this.driver=commonSteps.getDriver();
        this.editAccountElement=new EditAccountElement(driver);
    }
    public void EnterAccountNo(){
        editAccountElement.AccountNo.sendKeys("4653748488");
    }

    public void clickOnAccSubmit(){
        editAccountElement.AccSubmit.click();
    }
}
