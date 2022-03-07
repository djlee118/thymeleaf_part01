package com.example.thymeleaf_part01.controller;

import com.example.thymeleaf_part01.controller.model.DevOceanForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping(value="/api/v1/test")
public class ThymeleafTestController {
    @GetMapping(value= "/part01")
    public String index(@RequestParam String message, Model model) {
        DevOceanForm devOceanForm = new DevOceanForm("magic",1);

        model.addAttribute("message", message);
        model.addAttribute("devOceanForm",devOceanForm);
        return "index";
    }
}


