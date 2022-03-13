package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {

    WebDriver driver;
    @BeforeMethod
    public  void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethot() throws InterruptedException {
        Thread.sleep(3000);
       // driver.quit();
    }
    @Test
    public void test1(){

        driver.get("http://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        //locating and clicking destroy button
        driver.findElement(By.xpath("//*[text()='Confirm']")).click();

        //locating No button and clicking it
        driver.findElement(By.xpath("(//span[contains(text(),'No')])[8]")).click();

    }
    @Test
    public  void Alerts() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //click for JS Alert
        driver.findElement(By.xpath("//button[1]")).click();
        //controlling alert using with Alert class
        Alert alert=driver.switchTo().alert();
        //accept alert-->clicking ok in the alerts
        alert.accept();
        Thread.sleep(3000);

        //clicking JS confirm
        driver.findElement(By.xpath("//button[2]")).click();
       Thread.sleep(1000);
        alert.dismiss();

        //sent keys
        driver.findElement(By.xpath("//button[3]")).click();
        Thread.sleep(1000);
        //  alert=driver.switchTo().alert();
        alert.sendKeys("Mike Smith");

        alert.accept();


    }
}
