package com.example.exes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinglePageController {
    @GetMapping("/*")
    public String any() {
        return "forward:/indx.html";
    }
}