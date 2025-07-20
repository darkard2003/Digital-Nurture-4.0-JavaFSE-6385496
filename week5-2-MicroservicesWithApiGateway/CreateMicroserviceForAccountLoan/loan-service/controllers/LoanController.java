package com.cognizant.loan.controllers;

import com.cognizant.loan.models.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loan/{number}")
    public Loan getLoan(@PathVariable String number){
        return new Loan(number, "Home Loan", 15000, 20);
    }
}
