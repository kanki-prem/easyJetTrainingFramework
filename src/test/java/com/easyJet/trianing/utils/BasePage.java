package com.easyJet.trianing.utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasePage {

    public WebDriver driver;

    public void Browser() {

        String browser = System.getProperty("browser");

        if (browser.equals("chrome")) {

            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equals("safari")){
            driver = new SafariDriver();
        }
        else{
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        }
    }
}
