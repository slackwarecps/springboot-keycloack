package com.fabioalvaro.appb.keycloackappb;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {


    @GetMapping("/")
    public String index(){
        return "index!!!";
    }


}
