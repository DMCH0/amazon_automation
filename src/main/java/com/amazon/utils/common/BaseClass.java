package com.amazon.utils.common;

import com.codeborne.selenide.Configuration;

import static com.amazon.interfaces.IamazonConstants.BASE_URL;
import static com.codeborne.selenide.Selenide.open;

public class BaseClass {


    public static void openMainPage() {
        open(BASE_URL);
    }

    public static void openMainPageWithSubRoute(String subRoute) {
        Configuration.baseUrl = BASE_URL;
        open(subRoute);
    }
}
