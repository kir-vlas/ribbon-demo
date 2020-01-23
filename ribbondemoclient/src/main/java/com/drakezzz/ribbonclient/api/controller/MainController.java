package com.drakezzz.ribbonclient.api.controller;

import com.drakezzz.ribbonclient.api.dto.Guest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/demo")
public class MainController {

    private static final String HOST = "http://demo-server";

    private final RestTemplate ribbonRestTemplate;

    public MainController(RestTemplate ribbonRestTemplate) {
        this.ribbonRestTemplate = ribbonRestTemplate;
    }

    @GetMapping("/guest")
    public Guest getGuest() {
        return ribbonRestTemplate.getForObject(HOST + "/api/v2/clients/guest", Guest.class);
    }

}
