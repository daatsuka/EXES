package com.example.exes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SinglePageController {
    @GetMapping("/*")
    public String any() {
        return "forward:/indx.html";
    }
}