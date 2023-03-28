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

public class FindLocatorsTestsHomeWork {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://ilcarro.web.app/let-car-work");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByCssSelectorTest() {

        driver.findElement(By.cssSelector("#pickUpPlace"));
        driver.findElement(By.cssSelector("#make"));
        driver.findElement(By.cssSelector("#photos"));
        driver.findElement(By.cssSelector(".file-input-container"));
        driver.findElement(By.cssSelector(".address-data"));
        driver.findElement(By.cssSelector("[src='runtime-es2015.js']"));
        driver.findElement(By.cssSelector("[href='search/results?city=Berlin']"));
        driver.findElement(By.cssSelector("[for*='make']"));
        driver.findElement((By.cssSelector("[class^='soc']"))); //social-networks
        driver.findElement(By.cssSelector("[href$='Angeles']"));

    }

    @Test
    public void findElementByXpathTest() {

        //div[contains(text(),'Wrong address')]
        driver.findElement(By.xpath("//*[@id='pickUpPlace']"));
        driver.findElement(By.xpath("//*[@id='make']"));
        driver.findElement(By.xpath("//*[@id='photos']"));
        driver.findElement(By.xpath("//*[@class='file-input-container']"));
        driver.findElement(By.xpath("//*[@class='address-data']"));
        driver.findElement(By.xpath("//*[@src='runtime-es2015.js']"));
        driver.findElement(By.xpath("//*[@href='search/results?city=Berlin']"));
        driver.findElement(By.xpath("//*[contains(.,'fact')]")); //Manufacture
        driver.findElement(By.xpath("//*[starts-with(@for,'make')]"));
        driver.findElement(By.xpath("//*[contains(.,'Angeles')]"));
        driver.findElement(By.xpath("//*[contains(.,'soc')]"));

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
