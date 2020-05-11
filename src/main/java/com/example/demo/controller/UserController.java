package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping("/userInfo")
    public Map<String, Object> flushDb() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "小强");
        map.put("age", 18);
        map.put("birthday","2020");
        return map;
    }
}
