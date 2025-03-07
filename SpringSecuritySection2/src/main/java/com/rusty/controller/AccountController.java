package com.rusty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/MyAccount")
    public String getAccountDetails() {
        return "Your Account Details: \n" +
                "Account Number: 1234567890\n" +
                "Balance: $1000.00";
    }

}
