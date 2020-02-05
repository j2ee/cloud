package org.j2ee.cloud.mall.user.feign;

import org.j2ee.cloud.mall.user.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/orders")
@FeignClient("CLOUD-MALL-ORDER")
public interface OrderService {

    @GetMapping("/{id}")
    Order getOrder(@PathVariable int id);

}
