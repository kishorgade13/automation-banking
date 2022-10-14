package org.example.PageActions;

import org.example.PageElements.MiniStatementElements;
import org.example.StepDefinition.CommonSteps;
import org.openqa.selenium.WebDriver;

public class MiniStatementActions {

    WebDriver driver;

    MiniStatementElements miniStatementElements;

    public MiniStatementActions(CommonSteps commonSteps) {
        this.driver= commonSteps.getDriver();
        this.miniStatementElements=new MiniStatementElements(driver) ;
    }
    public void enterAccountNumber(){
        miniStatementElements.AccountNumber.sendKeys("6754635753");
    }
    public void clickOnSubmit(){
        miniStatementElements.miniStatementSubmit.click();
    }
}
