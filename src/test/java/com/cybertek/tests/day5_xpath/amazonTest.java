package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.amazon.com/");
        Thread.sleep(3333);
        //driver.findElement(By.xpath(" //input[starts-with(@id,'twotabsearchtextbox')]")).sendKeys("selenium");
       // WebElement search= driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]"));
        //search.click();
        driver.findElement(By.xpath("(//span[@class='nav-a-content'])[3]/parent::*")).click();
    }
}
