package com.spring.example.userbillingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
package com.spring.example.userbillingservice.service.UserBillingService;

@RestController
@RequestMapping("/hello")
public class UserBillingController {

    private final UserBillingService service;

    @Autowired
    public UserBillingController(UserBillingService service) {
        this.service = service;
    }

    @GetMapping("/{username}")
    public String availableChannels(@PathVariable String username) {
        return service.availableBillingChannels(username);
    }

}