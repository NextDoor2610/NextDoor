package com.batleship.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/Gamer1")
    public String Page1( Model model) {
        model.addAttribute("title", "Игрок 1");
        return "Page1";
    }

}
