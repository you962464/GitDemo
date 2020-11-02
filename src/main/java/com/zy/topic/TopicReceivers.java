package com.zy.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.msgs")
public class TopicReceivers {
    @RabbitHandler
    public void process(String msg){
        System.out.println("Receivers-12312-->" + msg);
    }

}