package com.test.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public String getResponse() {
        String date = String.valueOf(new Date());
        return "Testing controller for java intern " + date;
    }
}
