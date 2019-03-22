package com.example.demo.Controller;

import com.example.demo.Form.UserForm;
import com.example.demo.Service.UserService;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String asd() {
        return "hello jjjjj";//
    }

    @PostMapping
    public User register(UserForm userForm) {
        return userService.userRegister(userForm);

    }

}
