package org.j2ee.cloud.config.server.natives;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigServerNativeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServerNativeApplication.class, args);
    }

}
