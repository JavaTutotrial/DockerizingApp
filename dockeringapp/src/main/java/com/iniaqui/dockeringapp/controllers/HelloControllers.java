package com.iniaqui.dockeringapp.controllers;

import jakarta.annotation.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloControllers {
    @GetMapping("/hello")
    public String getHelloWord(@Nullable @RequestParam("name") String name) {
        if (name == null) {
            return "Hello world ";
        }
        return "Hello world ".concat(name);
    }


}
