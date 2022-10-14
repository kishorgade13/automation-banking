package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountElement {

    WebDriver driver;

    @FindBy(name = "accountno")
    public WebElement AccountNo;

    @FindBy(name = "AccSubmit")
    public WebElement AccSubmit;

    public EditAccountElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
