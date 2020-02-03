package org.j2ee.cloud.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudDiscoveryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDiscoveryEurekaApplication.class, args);
    }

}
