package com.zy.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.msg")
public class TopicReceiver {
    @RabbitHandler
    public void process(String msg){
        System.out.println("Receiver--->" + msg);
    }
}
