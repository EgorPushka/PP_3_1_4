package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.services.UserService;

import java.security.Principal;

@Controller
public class HelloController {

    private final UserService userService;

    @Autowired
    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String getInformForAll() {
        return "/index";
    }

    @GetMapping(value = "/users")
    public String getSecret(ModelMap modelMap) {
        modelMap.addAttribute("users", userService.indexUsers());
        return "/users";
    }

    @GetMapping(value = "/user")
    public String goToUserPage(ModelMap modelMap, Principal principal) {
//        modelMap.addAttribute("users", userService.indexUsers());
        modelMap.addAttribute("user", userService.findByUsername(principal.getName()));

        return "/user";
    }
}
