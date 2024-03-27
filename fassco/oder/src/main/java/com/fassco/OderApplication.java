package com.fassco;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class OderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OderApplication.class,args);
    }
}
