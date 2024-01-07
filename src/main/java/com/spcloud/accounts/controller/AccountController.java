package com.spcloud.accounts.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
@RefreshScope
public class AccountController {

    @Value("${text.info}")
    String sampleText;

    @GetMapping("/hi")
    public ResponseEntity<String> getHi()
    {
        String val = "Hello" + sampleText;
        return new ResponseEntity<String>(val, HttpStatus.OK);
    }
}
