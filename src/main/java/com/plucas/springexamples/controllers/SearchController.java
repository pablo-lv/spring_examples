package com.plucas.springexamples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    @GetMapping("/search")
    public String search(@RequestParam("search") final String search, Model model) {
        System.out.println("search criteria: " + search);
        return "search";
    }


}