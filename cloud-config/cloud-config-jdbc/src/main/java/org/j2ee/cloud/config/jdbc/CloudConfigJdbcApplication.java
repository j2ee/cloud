package org.j2ee.cloud.config.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
//@EnableConfigServer
@SpringBootApplication
public class CloudConfigJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigJdbcApplication.class, args);
    }

}
