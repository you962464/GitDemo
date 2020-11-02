package com.zy.easyqueue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "easyQueue")
public class EasyReceiver2 {

    @RabbitListener
    public void process(String easyQuery){

        System.out.println("EasyReceiver2 = " + easyQuery);

    }
}
