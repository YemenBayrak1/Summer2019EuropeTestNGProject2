package com.cybertek.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basic_navigation {
    public static void main(String[] args) {
        //We have to set up webdriver//
        WebDriverManager.chromedriver().setup();

        //creating object for using selenium driver
        WebDriver driver= new ChromeDriver();

        //open browser
        //driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.google.com");
        System.out.println(driver.getTitle());

    }
}
