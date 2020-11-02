package com.zy.easyqueue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class EasySender2 {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send2(){
        String sendMessage="生产者二"+new Date();
        System.out.println("send2 = " + sendMessage);
        rabbitTemplate.convertAndSend("easy",sendMessage);
    }
}
