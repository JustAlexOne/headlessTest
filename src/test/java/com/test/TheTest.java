package com.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TheTest {

    static {
        int port = 80; // todo
        Configuration.baseUrl = "http://127.0.0.1:" + port;
        Configuration.browser = WebDriverRunner.CHROME;

        System.setProperty("chromeoptions.args", "--headless,--disable-gpu"); // in order for chrome to work via vnc
    }

    @Test
    public void test1() throws Exception {
        Selenide.open("/");
        $("h1").shouldBe(visible);
    }
}
