package com.rusty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/MyBalance")
    public String getBalanceDetails() {
        return "Balance: $1000.00";
    }

}
