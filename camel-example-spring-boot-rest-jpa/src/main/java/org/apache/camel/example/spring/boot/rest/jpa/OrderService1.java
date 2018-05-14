package org.apache.camel.example.spring.boot.rest.jpa;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService1 {

    @Autowired
    private BookRepository books;

    private final Random amount = new Random();

    public Order generateOrder() {
        Order order = new Order();
       
        return order;
    }
}
