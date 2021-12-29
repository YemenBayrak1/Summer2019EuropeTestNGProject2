package com.cybertek.tests.day4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TagNameTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.findElement(By.tagName("input")).sendKeys("Mike Smith with tag name");
        driver.findElement(By.name("email")).sendKeys("awesdrfgt@gmail.com");
        driver.findElement(By.tagName("button")).click();
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        driver.findElement(By.className("nav-link")).click();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}
