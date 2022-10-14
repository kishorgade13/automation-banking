package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniStatementElements {

    WebDriver driver;

    @FindBy(name = "accountno")
    public WebElement AccountNumber;

    @FindBy(name = "AccSubmit")
    public WebElement miniStatementSubmit;

    public MiniStatementElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
