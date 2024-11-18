package com.amazon.amazon_pages.signin;

import com.codeborne.selenide.Condition;

import static java.time.Duration.ofSeconds;

public class SignIn_PageLogic extends SignIn_Page{

    public SignIn_PageLogic login(String credentials){
        emailInput().shouldBe(Condition.visible, ofSeconds(5)).setValue(credentials);
        continueBtn().shouldBe(Condition.visible, ofSeconds(5)).click();
        return this;
    }

}
