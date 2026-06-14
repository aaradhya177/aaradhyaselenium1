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

        options.setBinary("/opt/google/chrome/google-chrome");

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com");

        System.out.println("Website : https://www.saucedemo.com");
        System.out.println("Title : " + driver.getTitle());

        driver.quit();

        System.out.println("SAUCEDEMO OPENED SUCCESSFULLY");
    }
}
