package org.example.PageActions;

import org.example.PageElements.NewAccountElements;
import org.example.StepDefinition.CommonSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAccountActions {

    WebDriver driver;

    NewAccountElements newAccountElements;

    public NewAccountActions(CommonSteps commonSteps) {
        this.driver= commonSteps.getDriver();
        this.newAccountElements=new NewAccountElements(driver);
    }
    public void EnterCustomerId(){
        newAccountElements.customerId.sendKeys("mngr446493");
    }

    public void selectAccount(){
        newAccountElements.selectAccount.sendKeys("current");
    }

    public void initialDeposit(){

        newAccountElements.initialDeposit.sendKeys("50000");
    }

    public void ClickOnSubmit(){

        newAccountElements.submit2.click();
    }

}
