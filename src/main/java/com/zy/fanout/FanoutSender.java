package com.zy.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate rattibTemplate;

    public void send(){
        String fanoutMsg = "订阅消息";
        System.out.println("fanoutMsg:"+fanoutMsg);
        this.rattibTemplate.convertAndSend("fanoutExchange","韦军",fanoutMsg);
    }
}
