package com.phone.controller;

import com.phone.service.SmartPhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SmartPhoneController {
    @Autowired
    SmartPhoneServiceImpl smartPhoneService;

    @GetMapping("/")
    public String showIndex(){
        return "index";
    }
}
