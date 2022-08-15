package com.seba.portfolio.controller;

import com.seba.portfolio.model.User;
import com.seba.portfolio.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        loginService.postUser(user);
        return "Usuario creado.";
    }

    @PostMapping("/login")
    public boolean login(@RequestBody User user) {
        return loginService.checkLogin(user);
    }
}
