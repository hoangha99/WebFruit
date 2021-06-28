package com.web.fruit.Controller.Wallets;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wallets")
public class WalletsController {

    @GetMapping()
    public String  init(){
        return "wallets";
    }
}
