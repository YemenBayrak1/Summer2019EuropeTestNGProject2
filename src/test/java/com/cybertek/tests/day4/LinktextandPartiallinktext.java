package com.cybertek.tests.day4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinktextandPartiallinktext {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        Thread.sleep(4000);
       driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Home")).click();
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.partialLinkText("Example 6:")).click();
        Thread.sleep(5000);
        //driver.quit();
    }
}
