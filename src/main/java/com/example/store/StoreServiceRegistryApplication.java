package com.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StoreServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreServiceRegistryApplication.class, args);
    }

}
