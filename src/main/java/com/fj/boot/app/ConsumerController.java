package com.fj.boot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/ribbon-consumer")
    public String consumer() {
        ResponseEntity<String> result = restTemplate.getForEntity("http://service_test1_appname/ribbon-consumer", String.class);
        return result.getBody();
    }
}

