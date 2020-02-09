package org.j2ee.cloud.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class CloudAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminServerApplication.class, args);
    }

}
