package com.example.inpspect_open_api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@RestController
public class InfoRest {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping
    public List<String> getAllTopics() throws IOException {


        System.err.println("discoveryClient.getServices()");
        System.err.println(discoveryClient.getServices());

        return discoveryClient.getServices();
    }
}


