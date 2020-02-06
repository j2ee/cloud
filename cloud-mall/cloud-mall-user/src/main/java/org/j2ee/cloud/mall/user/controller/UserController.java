package org.j2ee.cloud.mall.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.j2ee.cloud.mall.user.feign.OrderService;
import org.j2ee.cloud.mall.user.model.Order;
import org.j2ee.cloud.mall.user.model.User;
import org.j2ee.cloud.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    @Value("${msg:world}")
    private String msg;

    private UserService userService;

    private OrderService orderService;

    @Autowired
    public UserController(UserService userService, OrderService orderService) {
        this.userService = userService;
        this.orderService = orderService;
    }


    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id) {
        return orderService.getOrder(id);
    }

    @GetMapping("/msg")
    public String getMsg() {
        log.info("msg: {}", msg);
        return msg;
    }

}
