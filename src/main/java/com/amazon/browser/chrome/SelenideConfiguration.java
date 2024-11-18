package com.amazon.browser.chrome;
import com.codeborne.selenide.WebDriverProvider;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.annotation.Nonnull;


public class SelenideConfiguration implements WebDriverProvider {

    public static void selenideConfiguration() {
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "1x1";
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 5000;
        Configuration.pageLoadTimeout = 30000;
    }

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        ChromeOptions options = new ChromeOptions();
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }
}
