package com.spring.example.userbillingservice.consumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingConsumer {

    private final RestTemplate restTemplate;

    @Value("${app.billingService.serviceId}")
    private String billingServiceId;

    @Value("${app.billingService.endpoint.billing}")
    private String billingServiceEndpointUri;

    @Autowired
    public BillingConsumer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "getDefaultBilling")
    public String getRandomBilling() {
        String billing = restTemplate.getForObject("http://billing-client" + billingServiceEndpointUri, String.class);
        return billing;
    }

    public String getDefaultBilling() {
        return "Internet Banking";
    }
}