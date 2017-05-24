package com.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TheTest {

    static {
        int port = 4567; // todo
        Configuration.baseUrl = "http://127.0.0.1:" + port;
        Configuration.browser = WebDriverRunner.CHROME;
    }

    @Test
    public void test1() throws Exception {
        Selenide.open("/");
        $("h1").shouldBe(visible);
    }
}
