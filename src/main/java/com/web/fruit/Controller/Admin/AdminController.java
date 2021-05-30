package com.web.fruit.Controller.Admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/management/api/")
public class AdminController {

    @GetMapping("admin")
    public String test(){
        return "admin";
    }
}
