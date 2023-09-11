package com.example.demoActiveMQ.controller;

import com.example.demoActiveMQ.model.Message;
import com.example.demoActiveMQ.service.SendService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {

    @Autowired
    public SendService sendService;

    @GetMapping("/send")
    public Message sendName(@RequestBody final Message message) {
//        first commit
        Message message1 = sendService.sendName(message);
        return message1;
    }
}
