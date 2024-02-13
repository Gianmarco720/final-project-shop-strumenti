package com.learning.team5shopstrumenti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pagamentoSicuro")
public class PagamnetoSicuroController {
    @GetMapping
    public String index(Model model) {
        return "strumenti/pagamentoSicuro";
    }
}
