package org.j2ee.cloud.mall.order.controller;

import org.j2ee.cloud.mall.order.model.Order;
import org.j2ee.cloud.mall.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public Order getOrder() {
        return null;
    }

}
