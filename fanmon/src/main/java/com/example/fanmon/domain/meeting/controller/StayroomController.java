package com.example.fanmon.domain.meeting.controller;

import com.example.fanmon.domain.meeting.service.StayroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StayroomController {
    @Autowired
    StayroomService stayroomService;
}
