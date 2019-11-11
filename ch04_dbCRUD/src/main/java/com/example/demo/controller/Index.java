package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class Index {
	
	@GetMapping("/index")
    public String prod(Model model) {
//        List<Product> dataList = new ArrayList<>();
//        model.addAttribute("text", "This product page.");
//        model.addAttribute("product", dataList);
        return "product";
    }
}
