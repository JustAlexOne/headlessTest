package com.main;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;

public class DriverBinaryProvider {

    public static void downloadBrowserBinary() {
        String browser = Configuration.browser;
        if (browser.equals(WebDriverRunner.CHROME)) {
            String chromeVersion = "2.28";
            System.out.println(String.format("Downloading ChromeDriver driver %s", chromeVersion));
            ChromeDriverManager.getInstance().version(chromeVersion).setup();
        } else if (browser.equals(WebDriverRunner.PHANTOMJS)) {
            String phantomJsversion = "2.1.1";
            System.out.println(String.format("Downloading PhantomJS driver %s", phantomJsversion));
            PhantomJsDriverManager.getInstance().version(phantomJsversion).setup();
        }
        System.out.println("Done");
    }

}
