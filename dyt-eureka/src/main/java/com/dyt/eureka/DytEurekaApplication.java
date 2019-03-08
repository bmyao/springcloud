package com.dyt.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DytEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DytEurekaApplication.class, args);
    }

}
