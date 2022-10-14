package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerElements {
    WebDriver driver;

    @FindBy(xpath = "//input[@onkeyup='validatecustomername();']")
    public WebElement customerName;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
    public WebElement Gender;

    @FindBy(id="dob")
    public WebElement dateOfBirth;

    @FindBy(name = "addr")
    public WebElement address;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "pinno")
    public WebElement pin;

    @FindBy(name = "telephoneno")
    public WebElement telephone;

    @FindBy(name = "emailid")
    public WebElement Email;

    @FindBy(name = "sub")
    public WebElement submit;

    public AddCustomerElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
