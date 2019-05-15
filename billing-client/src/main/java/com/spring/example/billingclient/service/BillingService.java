package com.spring.example.billingclient.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


@Service
public class BillingService {



    private final List<String> billingServices = Arrays.asList("Serviço-Carta-Cobrança", "Serviço-SMS-Cobrança", "Serviço-Email-Cobrança");



    public String getSevices() {

        Random random = new Random();

        int randomIndex = random.nextInt(billingServices.size());

        return billingServices.get(randomIndex);

    }

}