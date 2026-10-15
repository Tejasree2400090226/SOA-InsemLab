package com.example.shipping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    @GetMapping("/shipping")
    public String getShipping() {
        return "Shipping Service is working!";
    }
}