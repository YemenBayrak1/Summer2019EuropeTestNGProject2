package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class List_of_Elements {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons=driver.findElements(By.tagName("button"));
        System.out.println(buttons.size());
        Assert.assertEquals(buttons.size(), 6);
        for (WebElement button : buttons) {
            System.out.println(button.getText());

        }
        for(int i = 0; i < buttons.size(); i++) {
            System.out.print(buttons.get(i).getText());
            System.out.println();
        }



    }
    @Test
    public void test2(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //wrong locator but we not getting any error, we are getting emty list

        List<WebElement> buttons=driver.findElements(By.tagName("buttonfjfjdk"));
        System.out.println(buttons.size());


    }
}
