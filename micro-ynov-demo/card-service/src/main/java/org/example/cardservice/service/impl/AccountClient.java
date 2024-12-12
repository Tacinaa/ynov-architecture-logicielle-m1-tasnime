package org.example.cardservice.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AccountClient {

    @Value("${account-service.url}")
    private String accountServiceUrl;

    private final RestTemplate restTemplate;

    public AccountClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public boolean doesAccountExist(Long accountId) {
        String url = accountServiceUrl + "/accounts/" + accountId + "/exists";
        ResponseEntity<Void> response = restTemplate.getForEntity(url, Void.class);
        return response.getStatusCode().is2xxSuccessful();
    }
}