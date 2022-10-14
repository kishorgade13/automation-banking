package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountElement {

    WebDriver driver;

    @FindBy(name = "accountno")
    WebElement Account;

    @FindBy(name = "AccSubmit")
    WebElement DelAccountSubmit;

    public DeleteAccountElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
