package com.cybertek.tests.day8_type_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {
    @Test
    public void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. Locate the dropdown element with uniqui locator
        WebElement dropDownElement = driver.findElement(By.id("state"));

        //create select object by passing the element as a constructor
        Select stateList= new Select(dropDownElement);

        //getOptions -->returns all the available options from dropdown list
        List<WebElement> options=stateList.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());

        }

    }
    @Test
    public void test2() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. Locate the dropdown element with uniqui locator
        WebElement dropDownElement = driver.findElement(By.id("state"));

        //create select object by passing the element as a constructor
        Select stateList= new Select(dropDownElement);

        //verify that first option is "Select a State"
        String expectedOption = "Select a State";
        String actualOption = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption);

        Thread.sleep(5000);
        stateList.selectByVisibleText("Texas");
        actualOption=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, "Texas");

        stateList.selectByIndex(51);
        actualOption=stateList.getFirstSelectedOption().getText();
        System.out.println(actualOption);
        Assert.assertEquals(actualOption, "Wyoming");
        //3. using value
        Thread.sleep(5000);
        stateList.selectByValue("VA");
        actualOption=stateList.getFirstSelectedOption().getText();
        System.out.println(actualOption);
        Assert.assertEquals(actualOption, "Virginia");


    }
}
