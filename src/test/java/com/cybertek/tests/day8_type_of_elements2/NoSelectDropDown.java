package com.cybertek.tests.day8_type_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropDown {
    @Test
    public void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

       driver.findElement(By.id("dropdownMenuLink")).click();

        //open the drop down
        //dropdownElement.click();
        List<WebElement> listofLinks=driver.findElements(By.className("dropdown-item"));



        //print text of one link
        System.out.println(listofLinks.get(0).getText());
        //print text of each link
        for (WebElement listofLink : listofLinks) {
            System.out.println(listofLink.getText());

        }
        //locate the element and clicking it
       // driver.findElement(By.linkText("Yahoo")).click();
    }
}
