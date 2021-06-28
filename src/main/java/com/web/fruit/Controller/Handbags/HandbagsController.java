package com.web.fruit.Controller.Handbags;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/handbags")
public class HandbagsController {

    @GetMapping()
    public String  init(){
        return "handbags";
    }
}