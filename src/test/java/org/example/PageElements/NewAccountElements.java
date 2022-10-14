package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountElements {

    WebDriver driver;

    @FindBy(name = "cusid")
    public WebElement customerId;

    @FindBy(name = "selaccount")
    public WebElement selectAccount;

    @FindBy(name = "inideposit")
    public WebElement initialDeposit;

    @FindBy(name = "button2")
    public WebElement submit2;

    public NewAccountElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
