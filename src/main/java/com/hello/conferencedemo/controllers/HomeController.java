package com.hello.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    @Value("${app.version}")
    private String appVersion;

    @GetMapping(path="/")
    public Map getStatus() {
        Map status = new HashMap<String,String>();
        status.put("app_version",appVersion);
        return status;
    }
}
