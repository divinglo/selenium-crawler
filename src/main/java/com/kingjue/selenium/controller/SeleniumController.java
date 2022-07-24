package com.kingjue.selenium.controller;

import com.kingjue.selenium.service.SeleniumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class SeleniumController {

    @Autowired
    private SeleniumService seleniumService;

    @GetMapping("/test")
    public String test() {
        return "ok";
    }


}
