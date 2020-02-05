package org.j2ee.cloud.config.server.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigServerJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServerJdbcApplication.class, args);
    }

}
