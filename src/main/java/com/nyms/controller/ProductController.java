package com.nyms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by Minsu on 2017. 7. 7..
 */
@RequestMapping("/")
@RestController
public class ProductController {

    @Value("${env.greeting}")
    private String greeting;

    @Value("${eureka.instance.metadata-map.instanceId}")
    private String instanceId;

    @GetMapping("/")
    public Map<String, String> list() {
        Map<String, String> result = new HashMap<>();
        result.put("greeting", greeting);
        result.put("instanceId", instanceId);
        return result;
    }
}
