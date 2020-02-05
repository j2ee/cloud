package org.j2ee.cloud.mall.order.service.impl;

import org.j2ee.cloud.mall.order.model.Order;
import org.j2ee.cloud.mall.order.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Order getOrder() {
        return new Order(1);
    }

}
