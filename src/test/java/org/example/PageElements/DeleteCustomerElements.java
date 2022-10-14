package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerElements {

    WebDriver driver;

    @FindBy(name = "cusid")
    public WebElement customerID;

    @FindBy(name = "AccSubmit")
    public WebElement submit;


    public DeleteCustomerElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
