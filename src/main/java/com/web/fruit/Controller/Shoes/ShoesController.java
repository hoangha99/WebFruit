package com.web.fruit.Controller.Shoes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shoes")
public class ShoesController {

    @GetMapping()
    public String  init(){
        return "shoes";
    }
}
