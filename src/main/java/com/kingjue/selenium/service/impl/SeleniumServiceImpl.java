package com.kingjue.selenium.service.impl;

import com.kingjue.selenium.service.SeleniumService;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


@Service
@Slf4j
public class SeleniumServiceImpl implements SeleniumService {


    private final static String newReleases = "https://www.amazon.com/gp/new-releases/amazon-devices/ref=zg_bsnr_nav_0";


    private ChromeDriver driver;


    private WebDriverWait wait;



    @PostConstruct
    void postConstruct() {
        ChromeOptions options = new ChromeOptions();
        //不加载图片
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.managed_default_content_settings.images", 2);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        driver = new ChromeDriver(options);
        Map<String, Object> sourceMap = new HashMap<>();
        sourceMap.put("source", "Object.defineProperties(navigator, {webdriver:{get:()=>undefined}})");
        driver.executeCdpCommand("Page.addScriptToEvaluateOnNewDocument", sourceMap);
        wait = new WebDriverWait(driver, Duration.ofMillis(4000));
        driver.get(newReleases);

    }


}
