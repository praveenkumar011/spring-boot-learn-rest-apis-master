package com.codingshuttle.youtube.LearningRESTAPIs.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HttpHeaderSampleController {

    @GetMapping("/readHttpHeaders")
    public String readHttpHeaders(@RequestHeader Map<String,Object> requestHeaders) {
        System.out.println("Request Headers: " + requestHeaders);
        if(null != requestHeaders.get("username") && requestHeaders.get("username").equals("abc"))
        {
            return "Hello ABC";
        }
        return "Sample Response from readHttpHeaders";
    }

    @GetMapping("/setHttpHeaders")
    public String readHttpHeaders(HttpServletResponse resonseHeaders) {
        System.out.println("Request Headers: " + resonseHeaders);

        resonseHeaders.setHeader("Name", "Abc");
        resonseHeaders.setHeader("Location", "India");

        return "Setting up http Headers Response";
    }

    @GetMapping("/entityHttpHeaders")
    public ResponseEntity<String> readHttpHeaders() {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Name", "Abc");
        httpHeaders.set("Location", "India");
        return ResponseEntity.ok()
                .headers(httpHeaders)
                .body("Setting up http Headers Entity Response");

    }


}
