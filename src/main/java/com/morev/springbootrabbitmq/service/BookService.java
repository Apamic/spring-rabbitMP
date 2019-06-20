package com.morev.springbootrabbitmq.service;

import com.morev.springbootrabbitmq.Bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;


@Service
public class BookService {

    @RabbitListener(queues = "atguigu.news")
    public void receive(Book book) {
        System.out.println("收到消息" + book );
    }


    @RabbitListener(queues = "atguigu")
    public void receive2(Message message) {
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
