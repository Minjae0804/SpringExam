package com.minjae.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.*;

@Controller
public class PageController {

    private final GreetingRepository repository;

    public  PageController(GreetingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam("name") String name) {
        repository.save(new GreetingEntity(name));
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("greetings", repository.findAll());
        return "list";
    }

}
