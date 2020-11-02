package com.zy.easyqueue;

import com.zy.entity.StudentModel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "stu")
public class StuReceiver {
    @RabbitHandler
    public void process(StudentModel stu){
        System.out.println("生产者创建的学生对象" + stu.toString());
    }
}
