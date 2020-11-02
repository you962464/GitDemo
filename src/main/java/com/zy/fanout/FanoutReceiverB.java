package com.zy.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanoutMsgB")
public class FanoutReceiverB {
    @RabbitHandler
    public void process(String msg){
        System.out.println("FanoutReceiverB = " + msg);
    }
}
