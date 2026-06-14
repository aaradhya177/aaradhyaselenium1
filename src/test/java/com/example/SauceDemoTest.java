package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SauceDemoTest {

    @Test
    public void openSauceDemo() {

        System.out.println("=================================");
        System.out.println("SAUCEDEMO");
        System.out.println("=================================");

        ChromeOptions options = new ChromeOptions();

        // Use installed Chrome
        options.setBinary("/opt/google/chrome/google-chrome");

        // Jenkins/Linux compatibility
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = null;

        try {

            driver = new ChromeDriver(options);

            driver.get("https://www.saucedemo.com");

            System.out.println("Website : https://www.saucedemo.com");
            System.out.println("Title   : " + driver.getTitle());
            System.out.println("URL     : " + driver.getCurrentUrl());

            System.out.println("SAUCEDEMO OPENED SUCCESSFULLY");

        } catch (Exception e) {

            System.out.println("ERROR OCCURRED");
            System.out.println(e.getMessage());

            throw e;

        } finally {

            if (driver != null) {
                driver.quit();
            }
        }
    }
}

