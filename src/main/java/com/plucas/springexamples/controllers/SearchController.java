package com.plucas.springexamples.controllers;

import com.plucas.springexamples.beans.Product;
import com.plucas.springexamples.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/search")
    public String search(@RequestParam("search") final String search, Model model) {
        System.out.println("search criteria: " + search);
        List<Product> products = new ArrayList<>();
        products = productRepository.searchByName(search);
        model.addAttribute("products", products);
        return "search";
    }


}
