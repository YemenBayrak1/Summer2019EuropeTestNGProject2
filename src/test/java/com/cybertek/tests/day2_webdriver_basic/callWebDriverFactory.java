package com.cybertek.tests.day2_webdriver_basic;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class callWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.quit();
    }
}
