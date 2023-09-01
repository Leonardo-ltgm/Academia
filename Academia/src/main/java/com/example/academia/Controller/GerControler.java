package com.example.academia.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/academia")
public class GerControler {
    @GetMapping("/malhacao")
    public String Malhacao(){
        return "malhando cabecao";
    }
}
