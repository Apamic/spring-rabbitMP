package com.morev.springbootrabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 自动配置
 *  1,RabbitAutoConfiguration
 *  2,有自动配置了链接工厂ConnectionFactory；
 *  3,RabbitProperties 封装了RabbitMQ的所有配置
 *  4,RabbitTemplate 给RabbitMQ发送和接收消息
 *  5,AmqpAdmin 是 RabbitMQ系统管理功能组件
 *      AmqpAdmin: 创建和删除 Queues，Exchenge，Binding
 *  6,@EnableRabbit + @RabbitListener 来监听消息队列的内容
 */
@EnableRabbit //开启基于注解的RabbitMQ模式
@SpringBootApplication
public class SpringbootRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRabbitmqApplication.class, args);
    }
}
