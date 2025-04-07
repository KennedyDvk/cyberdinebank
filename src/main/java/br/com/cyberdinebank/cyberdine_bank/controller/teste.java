package br.com.cyberdinebank.cyberdine_bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class teste {

    @GetMapping("/")
    public String home() {
        return "Funcionando!";
    }
}
