package com.kingjue.selenium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSeleniumApplication {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/geckodriver.exe");
        SpringApplication.run(JavaSeleniumApplication.class, args);
    }

}
