package com.mainaqaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstWebTests {
    private RemoteWebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Test
    public void firstTest() {
        //Given user navigates to the main page by providing the valid url
        driver.get("https://www.ebay.com/");
        //When user clicks

        //And

        //Then user found the Sports Tab on the main page
        Assert.assertTrue(driver.findElement(By.xpath("//*[@data-hover-track='p2481888.m1384.l6435']")).isDisplayed());
    }

    @Test
    public void secondTest() {
        //Given user navigates to the starting page by providing the valid url
        driver.get("https://www.ebay.com/");
        //When user clicks

        //And

        //Then user found Shop by category button on the main page
        Assert.assertTrue(driver.findElement(By.xpath("//i[@id='gh-shop-ei']")).isDisplayed());
    }
    @Test
    public void thirdTest() {
        //Given user navigates to the starting page by providing the valid url
        driver.get("https://www.ebay.com/");
        //When user clicks

        //And

        //Then user found the Search field on the main page
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).isDisplayed());
    }
    @Test
    public void fourthTest() {
        //Given user navigates to the starting page by providing the valid url
        driver.get("https://www.ebay.com/");
        //When user clicks

        //And

        //Then user found the eBay Sites label in the lower right corner of the main page
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"gf-fbtn\"]")).isDisplayed());
    }
    @Test
    public void fifthTest() {
        //Given user navigates to the starting page by providing the valid url
        driver.get("https://www.ebay.com/");
        //When user clicks

        //And

        //Then user found the Facebook link on the main page
        Assert.assertTrue(driver.findElement(By.xpath("//*[@ href=\"https://www.facebook.com/eBay\"]")).isDisplayed());
    }
}


