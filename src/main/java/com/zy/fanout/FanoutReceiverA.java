package com.zy.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanoutMsgA")
public class FanoutReceiverA {
    @RabbitHandler
    public void process(String msg){
        System.out.println("FanoutReceiverA = " + msg);
    }
}
