package com.nyms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Minsu on 2017. 7. 10..
 */
@RequestMapping("/seller")
@RefreshScope
@RestController
public class SellerProductController {

    @Value("${env.greeting}")
    private String greeting;

    @GetMapping
    public String list() {
        return greeting;
    }

}
