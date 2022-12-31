package com.alexeydozorov.web.controllers;

import com.alexeydozorov.web.models.Orders;
import com.alexeydozorov.web.repos.RegistrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private RegistrRepository registrRepository;


    @GetMapping("/order")
    public String order(Model model) {
        Iterable<Orders> orders = registrRepository.findAll();
        model.addAttribute("orders", orders);
        return "order-main";
    }

    @GetMapping("/order/add")
    public String orderAdd(Model model) {
        return "order";
    }

    @PostMapping("/order/add")
    public String orderAddPost(@RequestParam int idBox, @RequestParam String email,
                              @RequestParam String number, Model model) {
        Orders order = new Orders(idBox, email, number);
        registrRepository.save(order);
        return "redirect:/order";
    }
}
