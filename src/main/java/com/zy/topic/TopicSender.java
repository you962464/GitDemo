package com.zy.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String msg1= "this is 1 message";
        System.out.println("sender1:" + msg1);
        this.rabbitTemplate.convertAndSend("exchange","topic.msg",msg1);

        String msg2= "this is 2 message";
        System.out.println("sender2:" + msg1);
        this.rabbitTemplate.convertAndSend("exchange","topic.msgs",msg2);
    }

}
