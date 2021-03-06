package com.cybertek.tests.day8_type_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {
    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement userNameInput=driver.findElement(By.id("username"));
        System.out.println(userNameInput.isDisplayed());
        Assert.assertFalse(userNameInput.isDisplayed(), "verfy that username inputbox is not displayed");
        WebElement startButton=driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        Thread.sleep(5000);
        System.out.println(userNameInput.isDisplayed());
        Assert.assertTrue(userNameInput.isDisplayed());



    }
}
