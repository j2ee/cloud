package org.j2ee.cloud.mall.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.j2ee.cloud.mall.order.model.Order;
import org.j2ee.cloud.mall.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id) {
        log.info("getOrder({}) run", id);
        return new Order(id);
    }

}
