package com.amazon.amazon_pages.main;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Main_Page {

    /**
     * Locators for the Main page
     */

    public SelenideElement signInBlock() {
        return $x("//div[@class='nav-line-1-container']");
    }
}
