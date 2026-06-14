package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SauceDemoTest {

    @Test
    public void openSauceDemo() throws Exception {

        System.out.println("=================================");
        System.out.println("SAUCEDEMO");
        System.out.println("=================================");

        ChromeOptions options = new ChromeOptions();

        options.setBinary("/opt/google/chrome/google-chrome");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com");

        System.out.println("Title : " + driver.getTitle());
        System.out.println("URL   : " + driver.getCurrentUrl());

        Thread.sleep(5000);

        driver.quit();
    }
}
