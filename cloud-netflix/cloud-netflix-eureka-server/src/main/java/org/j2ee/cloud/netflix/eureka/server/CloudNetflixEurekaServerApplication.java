package org.j2ee.cloud.netflix.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudNetflixEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNetflixEurekaServerApplication.class, args);
    }

}
