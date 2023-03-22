package com.ait.qa22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    //before - setUp(){}
    @BeforeMethod
    public void setUp() {
      // driver = new FirefoxDriver();
         driver = new ChromeDriver();
       // driver = new EdgeDriver();
        driver.get("https://www.google.com");
       // driver.get("https://www.mozilla.com");
    }
    //test
    @Test
    public void openGoogleTest() {
        System.out.println("Site opened!!!");
    }

    //after - tearDown(){}
}
