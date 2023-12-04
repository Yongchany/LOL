package com.example.lol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(Model model) {
        // 모델에 필요한 데이터 추가 (예: 메시지)
        model.addAttribute("message", "Welcome to the Main Page!");
        return "index";
    }
}