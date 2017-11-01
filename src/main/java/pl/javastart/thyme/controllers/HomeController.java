package pl.javastart.thyme.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

import java.time.LocalTime;

@Controller
public class HomeController {
    @RequestMapping("/")

    public String home(Model model) {
        model.addAttribute("data", LocalDate.now());
        model.addAttribute("czas", LocalTime.now());
        return "template";
    }
}