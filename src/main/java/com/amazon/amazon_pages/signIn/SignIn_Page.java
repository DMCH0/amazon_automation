package com.amazon.amazon_pages.signIn;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SignIn_Page {

    /**
     * Locators for the SignIn page
     */

    public SelenideElement emailInput() {
        return $x("//input[@type='email']");
    }

    public SelenideElement continueBtn() {
        return $x("//input[@id='continue']");
    }
}
