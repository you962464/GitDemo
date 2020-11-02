package com.zy.easyqueue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class EasySender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String sendMessage="lalal"+new Date();
        System.out.println("send = " + sendMessage);
        rabbitTemplate.convertAndSend("easy",sendMessage);
    }

}
