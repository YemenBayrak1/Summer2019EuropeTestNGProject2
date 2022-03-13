package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {
    WebDriver driver;
    @BeforeMethod
    public  void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethot() throws InterruptedException {
        Thread.sleep(3000);
         driver.quit();
    }
    @Test
    public void switchWindowTest(){
        driver.get("http://practice.cybertekschool.com/windows");

      WebElement clickHere= driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
      clickHere.click();
        System.out.println(driver.getTitle());

        String currentWindowHandle=driver.getWindowHandle();
        System.out.println("currentWindowHandle =" + currentWindowHandle);
        //after this line our purpos is switching to new window

        //Set is just like arraylist but without duplicate values
        Set<String> windowHandles=driver.getWindowHandles();

        //how many different handles is keeping
        System.out.println(windowHandles.size());

        //our problem is how can we get new window handle from set of handles. There is no index.
        for (String windowHandle : windowHandles) {
            if(!currentWindowHandle.equals(windowHandle)){
                System.out.println("before switching = " + driver.getTitle());
                driver.switchTo().window(windowHandle);
            }

        }
        System.out.println("after switching = " + driver.getTitle());

    }
    @Test
    public void moreThan2Window(){
        driver.get("http://practice.cybertekschool.com/windows");
        String targetWindowTitle="New Window";
        driver.findElement(By.linkText("Click Here")).click();

        //check how many object we have
        System.out.println(driver.getWindowHandles().size());
        Set<String> windowHandles=driver.getWindowHandles();

        //we will keep switching window until our title equals to targetWindowTitle.
        for (String windowHandle : windowHandles) {
            //switch them one by one
            driver.switchTo().window(windowHandle);
            if(driver.getTitle().equals(targetWindowTitle)){
                break;
            }
        }
        System.out.println("After loop = "+driver.getTitle());


    }

}
