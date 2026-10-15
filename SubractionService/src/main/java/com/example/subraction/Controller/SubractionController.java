package com.example.subraction.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubractionController {

    @GetMapping("/sub")
    public int add(@RequestParam int a,
                   @RequestParam int b) {

        return a - b;
    }
}

