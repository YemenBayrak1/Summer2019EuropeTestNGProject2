package com.cybertek.tests.day2_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/s?i=specialty-" +
                "aps&bbn=16225009011&rh=n%3A%2116225009011%2C" +
                "n%3A281407&ref=nav_em__nav_desktop_sa_intl_acc" +
                "essories_and_supplies_0_2_5_2");

        Thread.sleep(5000);
        driver.close();
        WebDriver driver2=new ChromeDriver();
        driver2.get("https://www.amazon.com");
        Thread.sleep(5000);
        driver.quit();

    }
}
