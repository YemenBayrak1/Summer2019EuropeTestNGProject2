package com.cybertek.tests.day2_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class gerUrlandTitle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        String title=driver.getTitle();
        System.out.println("Title="+ title);
        String currentUrl= driver.getCurrentUrl();
        System.out.println("CurrentUrl="+ currentUrl);
        System.out.println();
        String pageSourse= driver.getPageSource();
        System.out.println("pageSourse"+ pageSourse);
    }
}
