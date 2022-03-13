package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class css_test {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
      //  driver.get("http://practice.cybertekschool.com/multiple_buttons");
       // WebElement dontClickButton=driver.findElement(By.cssSelector("#disappearing_button"));
      //  WebElement dontClickButton=driver.findElement(By.cssSelector("[onclick='button 1()']"));
        driver.get("https://www.etsy.com/search?q=selenium");
        String search=driver.findElement(By.cssSelector("span[class='wt-hide-xs wt-show-md filter-expander']")).getText();
        System.out.println("text :" + search);
        //String message=dontClickButton.getText();
      //  System.out.println("yazi =" + message);
    }

}
