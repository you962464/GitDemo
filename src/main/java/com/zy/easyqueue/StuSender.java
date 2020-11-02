package com.zy.easyqueue;

import com.zy.entity.StudentModel;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StuSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){

        StudentModel stuList = new StudentModel(123,"张三","男","跑步","重庆西永");

        this.rabbitTemplate.convertAndSend("stu",stuList);

    }

}
