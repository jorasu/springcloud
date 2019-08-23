package com.example.modeleurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ModelEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModelEurekaServerApplication.class, args);
    }

}
