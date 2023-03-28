package com.ait.qa22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {

    WebDriver driver;

    //before - setUp(){}
    @BeforeMethod
    public void setUp() {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
      // driver = new FirefoxDriver();
      //  driver = new EdgeDriver();
      //  driver.get("https://www.google.com");
       // driver.get("https://www.mozilla.com");
        driver.navigate().to("https://www.google.com"); // with history
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    //test
    @Test
    public void openGoogleTest() {
        System.out.println("Site opened!!!");
    }

    //after - tearDown(){}
    @AfterMethod(enabled = true)
    public  void tearDown() {
        // close browser
        driver.quit();//all tabs & close browser
        // driver.close(); // only one tab(if tab only one -> close browser)

    }
}
