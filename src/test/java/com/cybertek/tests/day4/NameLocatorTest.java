package com.cybertek.tests.day4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullNameInput =driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("newemail@gmail.com");
        driver.findElement(By.name("wooden_spoon")).click();
        String signUpMessage=driver.findElement(By.name("signup_message")).getText();
        System.out.println("Messaj:"+signUpMessage);
        String expectedsignUpMessage="Thank you for signing up. Click the button below to return to the home page.";

        if(expectedsignUpMessage.equals(signUpMessage)){

            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.quit();
       // driver.quit();
    }
}
