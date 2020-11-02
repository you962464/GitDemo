package com.zy;

import org.springframework.amqp.core.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitmqApplication {

    //创建需要被使用的 队列对象 bean
    @Bean
    public Queue easyQuery(){
        return new Queue("easy");
    }
    @Bean
    public Queue student(){
        return new Queue("stu");
    }
    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange("exchange");
    }
    @Bean
    public Queue topicMsg(){
        return new Queue("topic.msg");
    }
    @Bean
    public Queue topicMsgs(){
        return new Queue("topic.msgs");
    }
    @Bean
    Binding bindingExchangeMessage(Queue topicMsg,TopicExchange exchange){
        return BindingBuilder.bind(topicMsg).to(exchange).with("topic.msg");
    }
    @Bean
    Binding bindingExchangeMessageS(Queue topicMsgs,TopicExchange exchange){
        return BindingBuilder.bind(topicMsgs).to(exchange).with("topic.#");
    }

    @Bean
    public Queue fanoutMsgA(){
        return new Queue("fanoutMsgA");
    }
    @Bean
    public Queue fanoutMsgB(){
        return new Queue("fanoutMsgB");
    }
    @Bean
    public Queue fanoutMsgC(){
        return new Queue("fanoutMsgC");
    }

    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    Binding bindingExchangeMsgA(Queue fanoutMsgA, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(fanoutMsgA).to(fanoutExchange);
    }
    @Bean
    Binding bindingExchangeMsgB(Queue fanoutMsgB, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(fanoutMsgB).to(fanoutExchange);
    }
    @Bean
    Binding bindingExchangeMsgC(Queue fanoutMsgC, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(fanoutMsgC).to(fanoutExchange);
    }

    

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqApplication.class, args);
        System.out.println("服务器启动完成了");
    }

}
