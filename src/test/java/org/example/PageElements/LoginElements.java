package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {

    WebDriver driver;

    @FindBy(xpath = "//input[@onkeyup='validateuserid();']")
    public WebElement UserID;

    @FindBy(xpath = "//input[@onkeyup='validatepassword();']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='LOGIN']")
    public WebElement logIn;



    public LoginElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
