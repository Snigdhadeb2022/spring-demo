package com.application.springdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("spring-demo")
public class SpringDemoController {

    @GetMapping
    public ResponseEntity<String> hello() throws UnknownHostException {

        InetAddress  inetAddress = InetAddress.getLocalHost();
        String hostname = inetAddress.getHostName();
        String ipAddress = String.valueOf(inetAddress)
                                    .replace(hostname,"")
                                    .replace("/","");
        return ResponseEntity.ok("Hello World from host- "+hostname+ " having ip-address as "+ipAddress);
    }
}
