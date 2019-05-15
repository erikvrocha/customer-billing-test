package com.spring.example.userbillingservice.service;

import com.jps.example.usergreetingservice.consumer.BillingConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBillingService {

    private final BillingConsumer billingConsumer;

    @Autowired
    public UserBillingService(BillingConsumer billingConsumer) {
        this.billingConsumer = billingConsumer;
    }

    public String availableBillingChannels(String username) {
        String billing = billingConsumer.getRandomBilling();
        return billing + " " + username + "!";
    }
}