package com.spring.example.billingclient.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.spring.example.billingclient.service.BillingService;

@RestController

@RequestMapping("/billing-client")

public class BillingClientControler {


    private final BillingService service;

    @Autowired
    public BillingClientControler(BillingService service) {
        this.service = service;
    }


    @GetMapping
    public String billing() {

        return service.getBillingSevices();

    }



}