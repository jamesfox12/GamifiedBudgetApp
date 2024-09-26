package com.example.GamifiedBudgetApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        System.out.println("Hello, World?!");
        return "redirect:/home.html"; // Redirects to static home.html
    }
}