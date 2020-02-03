package org.j2ee.cloud.circuit.breaker.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class CloudCircuitBreakerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudCircuitBreakerHystrixDashboardApplication.class, args);
    }

}
