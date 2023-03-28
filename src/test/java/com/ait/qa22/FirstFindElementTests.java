package com.ait.qa22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FirstFindElementTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://telranedu.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void FindElementByTagName() {
        // find element by tag
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }

    @AfterMethod
    public void tearDown() {
       driver.quit();
    }
}


