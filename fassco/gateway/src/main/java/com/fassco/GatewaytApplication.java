package com.fassco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewaytApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewaytApplication.class, args);
    }

}
