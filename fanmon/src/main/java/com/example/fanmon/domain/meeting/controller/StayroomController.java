package com.example.fanmon.domain.meeting.controller;

import com.example.fanmon.domain.meeting.service.StayroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StayroomController {
    @Autowired
    StayroomService stayroomService;
}
