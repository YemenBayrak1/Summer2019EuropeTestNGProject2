package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpathTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
      //  WebElement LinkHome=driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
     //   LinkHome.click();
         // System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/p")).getText());

       // driver.findElement(By.xpath("//button[text()='Button 1']")).click();
       // System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/p")).getText());
       // System.out.println(driver.findElement(By.xpath("//*[text()='Button 1']")).getText());
       // driver.findElement(By.linkText("Home")).click();
        //by text
        //driver.findElement(By.xpath("//a[.='Sign Up For Mailing List']")).click();
        //by partialy text
       // driver.findElement(By.xpath("//button[contains(text(),'ton 1')]")).click();
//Thread.sleep(3333);
     //   driver.findElement(By.xpath("//button[starts-with(@id,'button_')]")).click();
       // driver.quit();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("selam");



    }
}
