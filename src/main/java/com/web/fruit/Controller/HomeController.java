package com.web.fruit.Controller;

import com.web.fruit.Repository.UserRepository;
import com.web.fruit.config.WebSecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    WebSecurityConfig webSecurityConfig;

    @Autowired
    UserRepository userRepository;

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("index")
    public String home(){
        return "index";
    }

    @GetMapping("/403")
    public String error(){
        return "403Page";
    }

}
