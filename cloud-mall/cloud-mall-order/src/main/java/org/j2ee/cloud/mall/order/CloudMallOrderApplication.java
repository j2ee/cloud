package org.j2ee.cloud.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
public class CloudMallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudMallOrderApplication.class, args);
    }

}
