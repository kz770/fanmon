package com.example.fanmon.domain.chat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ChatController {

    @GetMapping("/test")
        public Map<String, Object> testHandler() {
            Map<String, Object> res = new HashMap<>();
            res.put("SUCCESS", true);
            res.put("SUCCESS_TEXT", "Hello SpringBoot/React");
            return res;
        }

}
