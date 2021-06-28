package com.web.fruit.Controller;

import com.web.fruit.Repository.UserRepository;
import com.web.fruit.config.WebSecurityConfig;
import com.web.fruit.dto.UserDto;
import com.web.fruit.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    WebSecurityConfig webSecurityConfig;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("register")
    public String register(Model model){
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }
    @GetMapping("doRegister")
    public String doRegister(@Valid UserDto user){
        User us = new User();
        if(user.getRepass().equals(user.getPassword())){
            us.setUsername(user.getUsername());
            us.setPassword(passwordEncoder.encode(user.getPassword()));
            us.setRoleId((1l));
            userRepository.save(us);
        }
        return "login";
    }

    @GetMapping("index")
    public String home(){

        //create account
        return "index";
    }

    @GetMapping("403")
    public String error(){
        return "403Page";
    }

}
