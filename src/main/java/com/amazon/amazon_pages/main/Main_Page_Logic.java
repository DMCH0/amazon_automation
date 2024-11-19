package com.amazon.amazon_pages.main;
import com.amazon.amazon_pages.signIn.SignIn_PageLogic;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;
import static java.time.Duration.ofSeconds;

public class Main_Page_Logic extends Main_Page{

    @Step("for: Main_page")
    public SignIn_PageLogic clickOnSingInBtn(){
        signInBlock().shouldBe(Condition.visible, ofSeconds(5)).click();
        return page(SignIn_PageLogic.class);
    }

}
