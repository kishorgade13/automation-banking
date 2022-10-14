package org.example.PageActions;

import org.example.PageElements.AddCustomerElements;
import org.example.StepDefinition.CommonSteps;
import org.openqa.selenium.WebDriver;

public class AddCustomerActions {
    WebDriver driver;

    AddCustomerElements addCustomerElements;

    public AddCustomerActions(CommonSteps commonSteps) {
        this.driver= commonSteps.getDriver();
        this.addCustomerElements=new AddCustomerElements(driver);
    }
    public void enterCustomerDetails(){
        addCustomerElements.customerName.sendKeys("test");
        addCustomerElements.Gender.click();
        addCustomerElements.dateOfBirth.sendKeys("12/04/2000");
        addCustomerElements.address.sendKeys("koregoan park");
        addCustomerElements.city.sendKeys("pune");
        addCustomerElements.state.sendKeys("MH");
        addCustomerElements.telephone.sendKeys("2621536728");
        addCustomerElements.pin.sendKeys("341215");
        addCustomerElements.Email.sendKeys("teat@gmail.com");
    }

    public void clickOnSubmit(){
        addCustomerElements.submit.click();
    }

}

