package com.fj.service1.app.service.impl;

import com.fj.service1.app.service.ConsumerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    @Override
    public String hello() {
        ResponseEntity<String> result = restTemplate.getForEntity("http://service-test1-name/hello", String.class);
        return result.getBody();
    }

    public String error() {
        logger.info("熔断器起作用");
        return "fail_";
    }
}
