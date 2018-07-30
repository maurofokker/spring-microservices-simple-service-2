package com.maurofokker.poc.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMicroservicesSimpleService2Application {

    @Value("${server.port}")
    public String port;

    @RequestMapping("/service")
    public String service() {
        return "Hello micro service from port " + this.port;
    }

    // root context path is used by ribbon client side load balance to check wether or not the particular
    // service is up and running. It is need it so ribbon is able to contact the micro service and register it
    // as a functional then it has that instance for load balancing
    @RequestMapping("/")
    public String status() {
        return "Up";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesSimpleService2Application.class, args);
    }
}
