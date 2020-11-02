package com.zy.controller;


import com.zy.easyqueue.EasySender;
import com.zy.easyqueue.EasySender2;
import com.zy.easyqueue.StuSender;
import com.zy.fanout.FanoutSender;
import com.zy.topic.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rebbit")
public class RattibEasy {
//    消息生成者

    @Autowired
    private EasySender easySender1;
    @Autowired
    private EasySender2 easySender2;
    @Autowired
    private StuSender stuSender;
    @Autowired
    private TopicSender topicSender;
    @Autowired
    private FanoutSender fanoutSender;

    @GetMapping("/easyTest")
    public void easySend(){
        easySender1.send();
    }

    //产生多个消息数据
    @GetMapping("/manyReceiver")
    public String manyReceiver(){
        for (int i = 0; i < 15; i++) {
            easySender1.send();
        }
        return "执行完毕！！！";
    }
    /**
     * 多个生产者+多个消费者 实现消息队列操作
     */
    @GetMapping("/msendTomrece")
    public String msendTomrece(){

        for (int i = 0; i < 10; i++) {
            easySender1.send();
            easySender2.send2();
        }

        return "又执行完了";
    }

    @GetMapping("/stuTomrece")
    public String stuTomrece(){
        stuSender.send();
        return "执行完毕";
    }

    @GetMapping("/topicText")
    public String topicText(){
        topicSender.send();
        return "执行完毕了呀！！！！";
    }

    @GetMapping("/fanoutText")
    public String fanoutText(){
        fanoutSender.send();
        return "执行完毕了呀！！！！";
    }
}
