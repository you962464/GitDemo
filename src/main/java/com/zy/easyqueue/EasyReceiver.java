package com.zy.easyqueue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "easyQueue")
public class EasyReceiver {

    @RabbitListener
    public void process(String easyQue) {

        System.out.println("EasyReceiver = " + easyQue);

    }

}