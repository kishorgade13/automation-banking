package org.example.PageActions;

import org.example.PageElements.LoginElements;
import org.example.StepDefinition.CommonSteps;
import org.openqa.selenium.WebDriver;

public class LoginActions {

    WebDriver driver;

    CommonSteps commonsteps;

    LoginElements loginElements;

    public LoginActions(CommonSteps commonSteps) {
        this.driver=commonSteps.getDriver();
        this.loginElements=new LoginElements(driver);
    }

    public void enterUserId(){

        loginElements.UserID.sendKeys("mngr446493");
    }

    public void enterPassword(){

        loginElements.password.sendKeys("usArura");
    }
    public void clickOnLogin(){

        loginElements.logIn.click();
    }
}
