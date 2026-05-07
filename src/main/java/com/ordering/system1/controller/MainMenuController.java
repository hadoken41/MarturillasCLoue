package com.ordering.system1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainMenuController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}