package org.j2ee.cloud.mall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CloudMallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudMallUserApplication.class, args);
    }

}
