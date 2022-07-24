package com.kingjue.selenium.service.impl;

import com.kingjue.selenium.service.FireFoxSeleniumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class FireFoxSeleniumServiceImpl implements FireFoxSeleniumService {


    private final static String newReleases = "https://www.amazon.com/gp/new-releases/?ref_=nav_cs_newreleases";


//    private FirefoxDriver driver;
//
//
//    private WebDriverWait wait;
//
//
//
//    @PostConstruct
//    void postConstruct() {
////        ChromeOptions options = new ChromeOptions();
//        FirefoxOptions options = new FirefoxOptions();
//        options.setPageLoadTimeout(Duration.ofMillis(1000*60));
//        //不加载图片
//        //options.addPreference("permissions.default.image", 2);
//        options.addPreference("dom.webdriver.enabled", "false");
//        driver = new FirefoxDriver(options);
//        wait = new WebDriverWait(driver, Duration.ofMillis(4000));
//        driver.get(newReleases);
//    }


}
