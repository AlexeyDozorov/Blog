package com.alexeydozorov.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Мы создали этот сайт");
        return "about";
    }



    @GetMapping("/tea")
    public String tea(Model model) {
        model.addAttribute("title", "Все виды чая");
        return "tea";
    }

    @GetMapping("/first")
    public String first(Model model) {
        model.addAttribute("title", "Это первая коробка");
        return "tea";
    }
    @GetMapping("/second")
    public String second(Model model) {
        model.addAttribute("title", "Это вторая коробка");
        return "tea";
    }
    @GetMapping("/third")
    public String third(Model model) {
        model.addAttribute("title", "Это третья коробка");
        return "tea";
    }

}