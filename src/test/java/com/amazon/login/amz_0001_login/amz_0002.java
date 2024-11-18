package com.amazon.login.amz_0001_login;

import com.amazon.amazon_pages.main.Main_Page_Logic;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.amazon.browser.chrome.SetUp.setUpChromeBrowser;
import static com.amazon.utils.common.BaseClass.openMainPage;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class amz_0002 {

    private Main_Page_Logic mainPageLogic = new Main_Page_Logic();
    private String email = "autoemail@amazon.com";

    @BeforeMethod
    public void setUp() {
        setUpChromeBrowser();
    }

    @Test()
    @Description("")
    public void testCheckLoginFromTheMainPage() {
        openMainPage();
        mainPageLogic.clickOnSingInBtn()
                .login(email);
    }

    @AfterMethod
    private void close() {
        closeWebDriver();
    }
}
