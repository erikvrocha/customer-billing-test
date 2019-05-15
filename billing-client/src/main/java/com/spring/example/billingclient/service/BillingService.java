package com.spring.example.billingclient.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


@Service
public class BillingService {



    private final List<String> billingServices = Arrays.asList("Servi�o-Carta-Cobran�a", "Servi�o-SMS-Cobran�a", "Servi�o-Email-Cobran�a");



    public String getSevices() {

        Random random = new Random();

        int randomIndex = random.nextInt(billingServices.size());

        return billingServices.get(randomIndex);

    }

}