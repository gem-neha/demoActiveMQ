package com.example.demoActiveMQ.service;

import com.example.demoActiveMQ.model.Message;
import com.example.demoActiveMQ.repository.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;



@Service
public class SendService {


    private JmsTemplate jmsTemplate;

    @Autowired
    private MessageRepo messageRepo;

    @Autowired
    public SendService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public Message sendName(Message message) {
        messageRepo.save(message);
        jmsTemplate.convertAndSend("Admin", message);
        return message;
    }
}
