package com.cognizant.account.controllers;

import com.cognizant.account.models.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account/{number}")
    public Account getAccountDetails(@PathVariable String number) {
        return new Account(number, "Savings", 1000);
    }
}
