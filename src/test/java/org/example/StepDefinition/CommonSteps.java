package org.example.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {
    WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown()throws InterruptedException{
        driver.quit();
        Thread.sleep(3000);
    }
}
