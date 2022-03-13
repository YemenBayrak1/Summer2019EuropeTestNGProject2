package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Iframes {
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
    public void test1(){
        driver.get("http://practice.cybertekschool.com/iframe");

        //How to switch frames
        driver.switchTo().frame("mce_0_ifr");

        //locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("Yemen Bayrak");

        //go back to first frame, useful when we have switched multiple frames
        driver.switchTo().defaultContent();

        //2. using index
        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Nihal Altin Bayrak");

        //go back to first frame, only to parent
        driver.switchTo().parentFrame();

        //3. using WebElement
        WebElement frameElement= driver.findElement(By.tagName("iframe"));

        //passing frame as a WebElement
        driver.switchTo().frame(frameElement);
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Serkan Bayrak");

    }
    @Test
    public  void multipleFrames(){
        driver.get("http://practice.cybertekschool.com/nested_frames");

        //switching to frame top
        driver.switchTo().frame("frame_top");

        //frame top  has 3 children frame , left, middle and right
        //switching to middle frame
        driver.switchTo().frame("frame_middle");

        //get the middle text and print it
        driver.findElement(By.id("content")).getText();

        //go back to parent (top frame) to switch right
        driver.switchTo().parentFrame();

        //switching  right using index
        driver.switchTo().frame(2);

        //print right from right frame
        System.out.println(driver.findElement(By.tagName("body")).getText());

        //go up to top level html directly
        driver.switchTo().defaultContent();

        //switching frame bottom
        driver.switchTo().frame(1);
        //System.out.println(driver.findElement(By.tagName("body")).getText());


    }

}
