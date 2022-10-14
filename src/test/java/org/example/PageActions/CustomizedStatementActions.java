package org.example.PageActions;

import org.example.PageElements.CustomizedStatementElement;
import org.example.StepDefinition.CommonSteps;
import org.openqa.selenium.WebDriver;

public class CustomizedStatementActions {

    WebDriver driver;

    CustomizedStatementElement customizedStatementElement;

    public CustomizedStatementActions(CommonSteps commonSteps) {
        this.driver=commonSteps.getDriver();
        this.customizedStatementElement=new CustomizedStatementElement(driver);
    }

    public void EnterAccountNumber(){
        customizedStatementElement.AccountNumber.sendKeys("6766797777");
    }

    public void selectFromDate(){
        customizedStatementElement.fromDate.sendKeys("12/03/1996");
    }

    public void selectToDate(){
        customizedStatementElement.toDate.sendKeys("10/08/2000");
    }

    public void enterLowerLimitAmount(){
        customizedStatementElement.lowerAmount.sendKeys("10000");
    }
    public void numberOfTransaction(){
        customizedStatementElement.noOfTransactions.sendKeys("5");
    }
    public void clickOnSubmit(){
        customizedStatementElement.customizedStatementSubmit.click();
    }
}
