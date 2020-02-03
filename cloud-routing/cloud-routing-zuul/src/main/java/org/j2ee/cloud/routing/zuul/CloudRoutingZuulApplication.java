package org.j2ee.cloud.routing.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class CloudRoutingZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudRoutingZuulApplication.class, args);
    }

}
